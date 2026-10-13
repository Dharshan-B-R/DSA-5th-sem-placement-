package com.linkedlist;

public class ImplementDLL {

	public static void main(String[] args) {
		
		DLL ob= new DLL();
//		ob.insertBegin(11);
//		ob.insertBegin(22);
//		ob.insertBegin(33);
//		ob.insertEnd(11);
//		ob.insertEnd(22);
//		ob.insertEnd(33);
//		
//		
		
//		
//		ob.insertEnd(11);//11
//		ob.insertEnd(22);//11->22
//		ob.insertEnd(33);//11->22=>33
//		ob.display();
//		ob.deleteBegin();//11
//		ob.deleteBegin();//22
//		ob.deleteBegin();//33
//		ob.deleteBegin();//list empty
////		ob.display();
//		
		

		ob.insertEnd(11);//11
		ob.insertEnd(22);//11->22
		ob.insertEnd(33);//11->22=>33
		ob.display();

//		ob.deleteEnd();//33 deleted
//		ob.deleteEnd();//22
//		ob.deleteEnd();//11
		ob.deleteEnd();//list empty
		ob.deletePos();
		
//		ob.insertPos(444);
//		ob.display();
//		ob.insertPos(555);
//		ob.display();
//		ob.insertPos(666);
//		ob.display();
//		ob.insertPos(999);
//		ob.display();
		
	}

}
