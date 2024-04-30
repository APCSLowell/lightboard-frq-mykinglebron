public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
   Lights= new boolean [numRows][numCols];
    for(int r=0; r<numRows; r++){
      for(int c=0; c<numCols; c++){
         double random =Math.random();
        Lights[r][c]= random<.4;
      }
    }

  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
    int numOn=0;
    for(int r=0; r<Lights.length; r++){
      if(Lights[r][col]){
        numOn++;
      }

    }
   if(Lights[row][col] && numOn%2==0){
return false;}
    if(!Lights[row][col] && numOn%3==0){
return true;}
    return Lights[row][col];
 
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
