/**
All the questions will be stored as objects of class Questions.
This class has 3 String data members:
question:String variable
options:String array containing the 4 choices for the question
correct:String variable which stores the correct choice
*/
class Questions{

   private String question;
   private String options[];
   private String correct;

   Questions()
   {
     question="";
     options= new String[4];
     correct="";
   }
  public void set(String question,String options[],String correct)
  {
    this.question=question;
    for(int i=0;i<4;i++)
    {
      this.options[i]=options[i];
    }
    this.correct=correct;
  }
  public static void main(String[] args)
  {
    
  }
}
