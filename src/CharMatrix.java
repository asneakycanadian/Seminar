/*
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
  // Fields:
  private char[][] charmander; //null
  

  /*
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
	  this(rows,cols, ' ');//calls the other constructor
//	  charmander = new char[rows][cols];
//	  for(int r = 0; r < charmander.length; r++){
//		  for(int c = 0; c < charmander[r].length; c++){
//			  charmander[r][c] = ' ';
//		  }
//	  }
  }

  /*
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill  character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
	  charmander = new char[rows][cols];
	  for(int r = 0; r < charmander.length; r++){
		  for(int c = 0; c < charmander[r].length; c++){
			  charmander[r][c] = fill;
		  }
	  }
  }

  /*
   * Returns the number of rows in grid
   */
  public int numRows()
  {
	  return charmander.length;
  }

  /*
   * Returns the number of columns in grid
   */
  public int numCols()
  {
	  return charmander[0].length;
  }

  /*
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
	  return charmander[row][col];
  }

  /*
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
	  charmander[row][col] = ch;
  }

  /*
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
	  if(charmander[row][col] == ' '){
		  return true;
	  }
	  return false;
  }

  /*
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   * 
   * Assumes all params are valid within the array
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
	  for(int r = row0; r <= row1; r++){
		  for(int c = col0; c <= col1; c++){
			  charmander[r][c] = fill;
		  }
	  }
  }

  /*
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
	  fillRect(row0, col0, row1, col1, ' ');
//	  for(int r = row0; r <= row1; r++){
//		  for(int c = col0; c <= col1; c++){
//			  charmander[r][c] = ' ';
//		  }
//	  }
  }

  /*
   * Returns the count of all non-SPACE characters in row.
   * 
   * pre: row is valid
   */
  public int countInRow(int row)
  {
	  int count = 0;
	  for(int c = 0; c < charmander[row].length; c++){
		  if(charmander[row][c] != ' '){//question.....
			  count++;
		  }
	  }
	  return count;
  }

  /*
   * Returns the count of all non-SPACE characters in col.
   * 
   * pre: col is valid in charmander
   */
  public int countInCol(int col)
  {
	  int count = 0;
	  for(int r = 0; r < charmander.length; r++){
		  if(charmander[r][col] != ' '){//question.....
			  count++;
		  }
	  }
	  return count;
  }
}
