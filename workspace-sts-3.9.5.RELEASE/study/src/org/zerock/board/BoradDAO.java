package org.zerock.board;

import java.util.ArrayList;
import java.util.List;



public class BoradDAO {
	
	//�̱���
	private static BoradDAO instance = new BoradDAO();
	
	private static List<BoardVO> boardList = new ArrayList<BoardVO>();
	
	public static BoradDAO getInstance() {
		
		return instance;

	}static {
		for(int k = 0; k < 5; k++) {
			boardList.add(new BoardVO(k,k+" ��° ����",k+" ��° ����", "2018-12-12", k));
			
		}
	}
	//CRUD �޼���
	//��ü��ȸ (read)
	
	public List<BoardVO> getBoardList(){
		return boardList;
	}
	
	
	public void addBoard(String board) {
		
		int size = boardList.size();
		boardList.add(new BoardVO(size, board)); //������ �߰�(�۹�ȣ, ����)

	}
	
	//������ ����(DELETE)
	public void removeBoard(int seq) {
		for(int k = 0; k < boardList.size(); k++) {
			if(boardList.get(k).getSeq() == seq) {
				boardList.remove(k);
				break;

			}
			
		}
	
	}

	public boolean modifyBoard(BoardVO board) {
		
		int seq = board.getSeq();
		
		for(int k = 0; k<boardList.size(); k++) {
			
			if(boardList.get(k).getSeq() == seq) {
				boardList.set(k, board);
				//boardList.get(k).setTitle(board.getTitle());
				//boardLsit.get(k).setcontent(board.getContent());
				//�̿� ���� �ص� �ȴ�.
				return true;
				
			}
			
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
}
