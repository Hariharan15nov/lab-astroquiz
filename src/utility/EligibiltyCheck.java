package utility;
import model.User;
public  class EligibilityCheck  extends  BasicEligibility implements EligibilityInterface
{
	@Override
	public boolean checkUser(User user) 
	{	 
	     int age =user.getAge();
		 int height =user.getHeight() ;
		 int weight=user.getWeight();
	     String country=user.getCountry();
	     System.out.println(age);
		if((18 <= age && age<= 35)&&(155 <=height&&height<=170)&&(55<= weight&&weight<= 90)&&(country.equals("ProGrad")) )
			return true;
		else
		return false;
	}
	@Override
	public boolean checkQuizAnswer(String points)
	{
		int score=Integer.parseInt(points);
		if(score>50)
			return true;
		else
		return false;
	}
	public	boolean basicEligibilityCheck(User user)
	{
		if(checkUser(user))
			return true;
		else
		return false;
	}
}







