package Text;

import java.util.Random;

public class WritingEffect {
	Random rand = new Random();
	private int speedtext = 1;
	private int rangetext = 40;
	private int lag = 1000;
	private int lagtime = 100;
	
	public void write(String phrase) {
		
		if(phrase.length()==1) System.out.print(phrase); 
		else if(phrase.length()>1) {
			int read = rand.nextInt(lagtime-1)+1;// 1~X
			int counter = 0;
			
			for (char caractere : phrase.toCharArray()) {
				System.out.print(caractere);
				
				if(counter < read) {
					wait(rand.nextInt(rangetext)+(speedtext));
				}
				else if (counter+1!=phrase.length()&&(caractere==' '||caractere=='_')){
					read += rand.nextInt(lagtime)+1;// 1~X
					wait(rand.nextInt(rangetext)+(lag*speedtext));
				}
				
				counter++;
			}
		}
		else {
			System.out.print("Nenhuma frase encontrada!");
		}
	}
	
	public void wait(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
