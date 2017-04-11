
package diamond;

public class Diamond {

	

		public static void main(String[] args) {
			char c;
			
			
			for(int p=1;p<=3;++p)        
			{
			c='a';
			for(int q=p;q<3;++q)        
			{
			System.out.print(" ");
			}
			for(int r=1;r<=p;++r)      
			{
			System.out.print(c);
			++c;
			}
			c-=2;
			for(int l=1;l<p;++l)     
			{
			System.out.print(c);
			--c;
			}
			System.out.println();   
			}
			
			
			for(int p=1;p<3;++p)        
			{
			c='a';
			for(int q=1;q<=p;q++)        
			{
			System.out.print(" ");
			}
			for(int r=1;r<=3-p;++r)      
			{
			System.out.print(c);
			++c;
			}
			c-=2;
			for(int l=1;l<3-p;++l)     
			{
			System.out.print(c);
			--c;
			}
			System.out.println();   
			}
		}
		
	}



	
