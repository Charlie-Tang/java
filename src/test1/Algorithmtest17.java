package test1;

public class Algorithmtest17 {

	public static void main(String[] args) {
		
		for(char i='x';i<='z';i++) 
		{			
			for (char j='x';j<='z';j++)
			{				 
				if(i!=j) 
				{				
					for(char k='x';k<='z';k++)
					{						
						if(i!=k&&j!=k) 
						{						
							if(i!='x'&&j!='x'&&j!='z')
							{							
								System.out.println("a:"+i+"\nb:"+j+"\nc:"+k);	
								}
						}
					}
				}
			}
		}


	}

}
