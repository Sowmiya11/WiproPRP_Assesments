package _12_00_MiniProject;
import java.util.Scanner;
class Video
{
	String title;
	boolean isAvailable;
	double avgUserRating;
	
	public Video(String title)
	{
		this.title = title;
		this.isAvailable = true;
	}
	public boolean isAvailable()
	{
		return isAvailable;
	}
	public void returnBack()
	{
		isAvailable = true;
	}
	public void setUserRating(int rating)
	{
		avgUserRating = (avgUserRating+rating)/2;
	}
}

class VideoStore
{
	int count;
	Video objVideos[] = new Video[10];
	
	public void addVideo(String title)
	{
		objVideos[count++]=new Video(title);
	}
	public void checkOut(String title)
	{
		for(int i=0;i<count;i++)
		{
			if(objVideos[i].title.equals(title))
			{
				if(objVideos[i].isAvailable)
					System.out.println("This videos "+title+"is available now");
				else
					System.out.println("This videos "+title+"is rented out");
				break;
			}
			else
				System.out.println("This videos "+title+"is not available in the store");
		}
	}
	
	public void returnVideo(String title)
	{
		int rating=0;
		for(int i=0;i<count;i++)
		{
			if(objVideos[i].title.equals(title))
			{
				System.out.println("Enter the rating for this video : ");
				rating = new Scanner(System.in).nextInt();
				receiveRating(title, rating);
				break;
			}
		}
	}
	
	public void receiveRating(String title, int rating)
	{
		for(int i=0;i<count;i++)
		{
			if(objVideos[i].title.equals(title))
			{
				objVideos[i].setUserRating(rating);
				break;
			}
		}
		
	}
	
	public void listInventory()
	{
		System.out.println("S.NO. \t\t Video Title \t\t\t Rating \t\t Availablility");
		for(int i=0;i<count;i++){			
			System.out.println(i+1 +"\t\t"+ objVideos[i].title +"\t\t"+ objVideos[i].avgUserRating +"\t\t"+ objVideos[i].isAvailable);
	}
		
	}
}
public class _01VideoStoreLauncher 
{
	public static void main(String[] args) 
	{
		int choice = 0;
		String ch;
		VideoStore objNewStore = new VideoStore();
		do
		{
			System.out.println("1. Add new video");
			System.out.println("2.Returning video:");
			System.out.println("3. List Inventory");
			choice = new Scanner(System.in).nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the new video name");
					String title = new Scanner(System.in).nextLine();
					objNewStore.addVideo(title);
					break;
				case 2:
					System.out.println("Enter the name of the video for checking or checkout");
					String titleForcheckVideo = new Scanner(System.in).nextLine();
					objNewStore.checkOut(titleForcheckVideo);
				case 3:
					System.out.println("Enter the Return Video name");
					String titleForReturnVideo = new Scanner(System.in).nextLine();
					objNewStore.returnVideo(titleForReturnVideo);
					break;				
				case 4:
					objNewStore.listInventory();
					break;
			}
			System.out.println("If you want to continue(Y/N):");
			ch=new Scanner(System.in).nextLine();
		}while(ch=="yes"|| ch=="YES");
	}
}
