package view;

import javax.swing.JOptionPane;

import controller.FilaController;
import controllerFila.FilaObject;

public class Main {

	public static void main(String[] args) 
	{
		FilaObject fila = new FilaObject();
		FilaObject filaPrioritarios = new FilaObject();
		
		int option = -1; 
		
		
		
		for(int i = 1; i < 10; i++)
		{
			fila.insert(i);
			if(i > 3)
			{
				filaPrioritarios.insert(i-3);
			}
		}
		
		
		
		FilaController controll = new FilaController(fila, filaPrioritarios);
		
		while(option != 9)
		{
			
			option = Integer.parseInt(JOptionPane.showInputDialog("opcoes: " +
																  "\n01 - add senha." +
																  "\n02 - chamar senha." +
																  "\n09 - sair do sistema."));
			switch(option)
			{
			case 1:
				controll.addSenha();
				break;
			case 2:
				controll.chamarSenha();
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida.");
			
			}
			
			
		}
		
		
		
	}

}
