package assignmentPfDay4;

import java.util.ArrayList;
import java.util.List;

public class TowersOfHanoi {
	protected List<String> moves;								//DECLARE THE LIST OF MOVES
	
	/*CONSTRUCTOR TO INITIALIZE THE LIST */
	public TowersOfHanoi(){												
		moves= new ArrayList<String>();
	}
	
	/*METHOD TO FIND THE MOVE AND ADD IT TO LIST
	 * TAKES 4 INPUT PARAMETERS START, DESTINATION, AUXILIARY AND NO OF DISKS
	 * RETURNS THE LIST OF MOVES
	 */
	public List<String> calculateMoves(String start, String destination, String auxiliary, int noOfDisks){
		if(noOfDisks <= 0 || noOfDisks > Integer.MAX_VALUE || start.length() > 1 || destination.length() > 1 || auxiliary.length() > 1){// IF ANY INVALID INPUT
			throw new IllegalArgumentException();																		// THROW AN EXCEPTION
		}else if(noOfDisks==1){																							// IF NO OF DISKS = 1
			moves.add("move top disk from "+start+" to "+destination);													// ADD THE MOVE FROM START TO DESTINATION
		}else{																											// ELSE
			calculateMoves(start, auxiliary, destination, noOfDisks-1);													// MOVE N-1 DISKS FROM START TO AUXILIARY (RECURSIVE)
			calculateMoves(start, destination, auxiliary, 1);															// MOVE 1 DISK FROM START TO DESTINATION
			calculateMoves( auxiliary, destination, start, noOfDisks-1);												// MOVE N-1 DISKS FROM AUXILIARY TO DESTINATION (RECURSIVE)
		}
		return moves;																									// RETURN LIST OF MOVES
		
	}


}
