package test;

public class A {


	 static {
	        boolean flag = true;
	        if (flag) {

	        	  try {
	            throw new RuntimeException("��ʼ����ʧ��");
	        	  }catch(Exception e) {
	        		  e.printStackTrace();
	        	  }
	        }
	    }
  
	
	
	public static void main(String[] args) {
	 //  A a =new A();

	}

}
