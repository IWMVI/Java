import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int n1, n2, n3, n4;
        float media;
        
        n1 = Integer.parseInt (JOptionPane.showInputDialog ("Qual a primeira nota?"));
        n2 = Integer.parseInt (JOptionPane.showInputDialog ("Qual a segunda nota?"));
        n3 = Integer.parseInt (JOptionPane.showInputDialog ("Qual a terceira nota?"));
        n4 = Integer.parseInt (JOptionPane.showInputDialog ("Qual a quarta nota? "));
        
        media = (n1+n2+n3+n4)/4;
        
        System.out.println ("A media e: " +media);

      if (media > 6){
        System.out.println ("Aprovado");
      } 
      else {
        
      }
    }
    
}
