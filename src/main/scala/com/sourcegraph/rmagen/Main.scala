package com.sourcegraph.rmagen

object Main extends App {
  val code =
    """
      |public class JustSomeRandomJavaCodeIFoundOnline {
      |    private int[][] myTruth;
      |    private boolean[][] myShow;
      |
      |    public void cellPicked(int row, int col) {
      |        string s = "some string";
      |
      |        if (inBounds(row, col) && !myShow[row][col]) {
      |            myShow[row][col] = true;
      |
      |            if (myTruth[row][col] == 0) {
      |                for (int r = -1; r <= 1; r++)
      |                    for (int c = -1; c <= 1; c++)
      |                        cellPicked(row + r, col + c);
      |            }
      |        }
      |    }
      |
      |    public boolean inBounds(int row, int col) {
      |        return 0 <= row && row < myTruth.length && 0 <= col && col < myTruth[0].length;
      |    }
      |}
    """.stripMargin

  println()
  println(s"Presenting some code tools examples, edit the source file to play with it.")
  println(s"--------------------------- The Code -------------------------------------")
  println(code)
  println(s"--------------------------- Examples of calls-----------------------------")
  val tools = new CodeTools(code)

  val myShowLoc = PositionLocation(code.lastIndexOf("myShow") + 1) // arbitrary position in the string
  val myShowDef = tools.jumpToDef(myShowLoc)

  val myTruthLoc = PositionLocation(code.lastIndexOf("myTruth") + 4) // arbitrary position in the string
  val myTruthDef = tools.jumpToDef(myTruthLoc)

  println()
  println(s"definition of myShow is in location ${myShowDef.start}-${myShowDef.end}")
  println(s"definition of myTruth is in location ${myTruthDef.start}-${myTruthDef.end}")

  println()
  println(s"tooltip for myShow: ${tools.tooltip(myShowLoc)}")
  println(s"tooltip for myTruth: ${tools.tooltip(myTruthLoc)}")


  println()
  println(s"usages of myShow: ${tools.references(myShowLoc)}")
  println(s"usages of myTruth: ${tools.references(myTruthLoc)}")
  println()
}
