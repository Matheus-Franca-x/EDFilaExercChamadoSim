package controller;

import javax.swing.JOptionPane;

import controllerFila.FilaObject;

public class FilaController 
{
	
	private FilaObject fila;
	private FilaObject filaPrioritaria;
	private static int i;
	private static int senha = 10;
	private static int senhaP = 7;
	
	
	public FilaController(FilaObject f, FilaObject fp)
	{
		this.fila = f;
		this.filaPrioritaria = fp;
	}
	
	public void addSenha()
	{
		int opcao = -1;
		
			while (opcao != 9)
			{
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a fila" +
																	 "\n01 - fila." +
																	 "\n02 - fila prioritaria." +
																	 "\n09 - cancelar operacao."));
				switch(opcao)
				{
					case 1:
						fila.insert(senha);
						JOptionPane.showMessageDialog(null, "Senha " + senha + " foi gerada." +
															"\nQuantidade de senha: " + fila.size());
						senha++;
						break;
					case 2:
						filaPrioritaria.insert(senhaP);
						JOptionPane.showMessageDialog(null, "Senha " + senhaP + " foi gerada." +
								"\nQuantidade de senha: " + filaPrioritaria.size());
						senhaP++;
						break;
					case 9:
						
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opcao invalida.");
				}
			}
	}
	
	public void chamarSenha()
	{
			
			try {
				if(!filaPrioritaria.filaVazia())
				{
					i++;
					JOptionPane.showMessageDialog(null, i % 4 == 0 ? "Senha " + fila.remove() + " foi chamado." +
						 											 "\nQuantidade na fila: " + fila.size() : 
						 											 "Senha " + filaPrioritaria.remove() + " foi chamado." +
						 											 "\nQuantidade na fila prioritaria: " + filaPrioritaria.size());
				}
				else if(!fila.filaVazia())
				{
					JOptionPane.showMessageDialog(null, "Senha " + fila.remove() + " foi chamado." +
														"\nQuantidade na fila: " + fila.size());
				}
			} catch(Exception e)
			{
				throw new RuntimeException(e);
			}
			if(fila.filaVazia() && filaPrioritaria.filaVazia())
			{
				JOptionPane.showMessageDialog(null, "A fila esta vazia, add mais senhas.");
			}
	}
	
	
	
	

}
