import javax.swing.JOptionPane;


/*****************************************************************************
 * ***************************************************************************
 * @author tofu.
 * 
 * @version 1.0b
 * ***************************************************************************
 * ***************************************************************************
 */
public class DanMichael {
    
    public static void main(String[]args){
        
        String question;
        String input;
        String output;
        String str;
        
        question = JOptionPane.showInputDialog
                    ("Enter a number from 1 to 10 and click OK");
        
        str = "Now multiply that number by 9 and click OK";
        
        JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.INFORMATION_MESSAGE);
        
        str = "If the result is 2 digits, add them together." + "\n" +
                "Then click OK";
        
        JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.INFORMATION_MESSAGE);
        
        str = "Now subtract 5 and click OK";
        
        JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.INFORMATION_MESSAGE);
        
        str = "You now have a result?";
                
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.QUESTION_MESSAGE);
         
         str = "Now determine which letter in the alphabet" + "\n" +
                "corresponds to the number you ended up with." + "\n" +
                 "Like 1 equals to A, 2 equals to b, 3 equals to C and so on..";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.INFORMATION_MESSAGE);
         
         str = "Ok now think of a country that starts with that letter.";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.INFORMATION_MESSAGE);
         
         str = "Already have one?";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.QUESTION_MESSAGE);
         
         str = "With the last letter of that country in your mind," + "\n" +
                 "think of an animal that begins with that letter.";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.INFORMATION_MESSAGE);
         
         str = "Already have an animal in your mind?";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.QUESTION_MESSAGE);
         
         str = "Now, with the last letter of that animal," + "\n" +
                 "think of a fruit that begins with that letter.";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.INFORMATION_MESSAGE);
         
         str = "Already have a fruit?";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.QUESTION_MESSAGE);
         
         str = "Ok now here's the magic...." + "\n" +
         "Denmark is the country in your mind";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.WARNING_MESSAGE);
         
         str = "Kangaroo is the animal";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.WARNING_MESSAGE);
         
         str = "....and Orange is the fruit";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.WARNING_MESSAGE);
         
         str = "MAGIC!!!!!" + "\n" +
                 "Thank's for playing..." + "\n" +
                 "-tofu.";
         
         JOptionPane.showMessageDialog(null, str, "Dan Michael", +
                                       JOptionPane.ERROR_MESSAGE);
         
         System.exit(0);
         
                 
                 
                 
    }
    
}