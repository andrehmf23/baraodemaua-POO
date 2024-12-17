package main;

import java.util.Timer;
import java.util.TimerTask;

public class GameSystem {
	static public void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
        	int i = 0;
        	
            @Override
            public void run() {
            	i++;
            	System.out.println("Run"+i);
            	 Runnable tarefa = () -> {
                     new Thread(() -> {
                         System.out.println("Operação 1 na thread 1!");
                     }).start();

                     new Thread(() -> {
                         System.out.println("Operação 2 na thread 2!");
                     }).start();
                 };
                 if(i==3)tarefa.run();
            }
        };

        // Agendar a tarefa para ser executada a cada 1000 milissegundos
        timer.scheduleAtFixedRate(task, 0, 1000);
	}
}
