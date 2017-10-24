# Take home exercise for Sourcegraph

## Introduction

Hi,

Thank you for reviewing this.

I'm submitting this code, out of respect for your 4-hour request. However, I must say that I'm not happy with the end-result.
The task seemed to me like it was doomed to fail in the given time limit. And I consider this a failure given that, as a developer, this is not a tool I would use.
It's a beginning of one at most. Obviously, sacrifices had to be made. :(

## How to run

1. Install sbt if you don't have it `brew install sbt`
2. Install scala if you don't have it `brew install scala`
3. clone the repo locally
4. run `sbt run` in the root folder.

The sbt compilation phase generates source code from the Java.g4 file under src/main/antlr4/..
That generate source is used by the main code.

The code in `Main.scala` demonstrates the usage of `CodeTools.scala`, that implements finding declarations, references and tooltips.

The code in `PrintingJavaListener.scala` is not used by the main process, I just used that to figure out which listeners I have to use in my listener implementation.

## Important comments:
1. The API is just a scala one, no "developer" would use this, it has to be integrated into some kind of service (in process or otherwise) invoked by some UI or code editor.
2. Due to a lack of time, I didn't write a formal unit test, but the examples in the Main.scala file are there to show the code works, however, I didn't test too many variations of code.
3. The implementation is hacky, it's a first pass and a reasonable result for 4 hours IMO. It builds a solid base for analyzing Java, and is easily extendible to adding more features, since the process builds an entire AST for any given code that contains all locations of all tokens.
   I felt that while the implementation is lacking some of your requests (namely, tests, or a nice way to invoke it), it shows off a cleaner base for a better long term implementation. The alternative would have been a much worse hack IMO that I would simply rather not submit. (regexes? iterating on the code string many times? blech.) 
4. This is by far not trying to be an efficient solution, although indexing does happen once, and as a token stream (i.e. we "pass" over the code once, O(n) in code length) and definitely contains some bugs for edge cases (one such example is code that doesn't parse correctly -- I didn't handle error nodes in the parsing process)
5. This code would behave terribly if it had to react to changes. I would not use this implementation directly from an editor given how many times an editor changes. Most likely, a "real" implementation would have some kind of incremental index building, along with in-place mutation of an existing index so that any changes to the code would be efficiently updated in the backing index. updating the index would be triggered after a break in typing and would only index "dirty" tree nodes in the AST and bubble up to the parent. 
    Actually, I'd love to just chat about how to go about this in the "real" world. Sounds interesting.
6. There are some relevant comments in the code about potential failures.
7. If anything, I learned a lot during those few hours. Specifically how *not to* write code analysis :)
8. If you'd like me to delete this from github once you're done reviewing, I can do that. Just let me know. (to avoid others finding this implementation)

## How to best review this code

Take a look at `Main.scala`. That one instantiates `CodeTools.scala`, which kicks off the indexing upon construction and implements the public functions you've requested. `IndexingJavaListener.scala` incrementally invokes functions in `CodeIndex.scala` to build the index, so look at the former and jump to the latter on each function.

## Resources I found online
* antlr4: https://github.com/antlr/antlr4
* The Java.g4 file from https://github.com/antlr/grammars-v4/blob/master/java/Java.g4


