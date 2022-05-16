
public class CYOCObject {
	private String name;
	private String restName;
	private int age;
	
	
	public CYOCObject(String nm, String rN, int a) {
		name = nm;
		restName = rN;
		age = a; 
	}
	
	public String getName() {
		return (name);
	}
	
	public String getRest() {
		return(restName);
	}
	
	public int getAge() {
		return(age);
	}
	
	public String beginning() {
		return "\n\nYour name is " + getName() + ", you are a/an " + getAge() + " year old\n"
				+ "teenager down on their luck on a Friday night. You just got handed \n"
				+ "three separate writing assignments for finals and have zero time to work on them. \n"
				+ "Before stress overtakes your mind you decide to take a walk around town to clear your head. \n"
				+ "None of your friends are interested in talking with you at the moment, so you are alone. \n"
				+ "You feel a deep hollowness inside your gut, but the rumbling tells you that \n"
				+ "it is just hunger and not something worse. Unfortunately, your walk began at 1 AM, \n"
				+ "leaving your options for food limited. With few options left, you decide to\n"
				+ "go to your favorite restaurant, " + getRest() +".\n";
		
	}

	public String scenario1() {
		return "\nAs you approach your local " + getRest() + ", the dimmed lights clue you in on the worst-case scenario, the store was not open yet! \n"
				+ "Of all the days they had to open late, they had to choose TODAY of all days!?! \n"
				+ "Staring at the darkened interior through the glass doors, you decide to. . .\n"
				+ "1) Go Home\n"
				+ "2) Look through the dumpster\n"
				+ "3) Enter anyways\n"
				+ "4) Go to another restaurant\n"
				+ "(Please type the number that corrisponds to your choice!): ";
		
	}
	
	public String oneOne() {
		return "\nDespite going on the walk to escape the cruelness of your current reality, you decide that going home is the better option than waiting outside while hunger tears away at your insides. \n"
				+ "Walking back took the better part of an hour and a half, but eventually, the porch light of your resilience greets your eyes. \n"
				+ "Unlocking the door with your mustache house key, your immediate thought is to see what was available in your fridge. \n"
				+ "If you couldn’t have food at " + getRest() + ", you could at least fix something up here, right? \n"
				+ "Wrong. As the door opens and the cold air that accompanies the gentle glowing interior light greets your eyes, you are met with resounding disappointment. "
				+ "There is nothing worth eating inside your fridge, nothing but stale cheese and a couple of ketchup packets. \n"
				+ "Your complacency with eating out has left you complacent with buying groceries, and now the consequences are catching up with you. \n"
				+ "With nothing left to do, you crawl up to your room to go back to bed, with nary a sandwich to tame the growing hunger in your stomach. \n"
				+ "You are doomed to repeat the cycle again. \n"
				+ "THE END. \n";
	}
	
	public String oneTwo() {
		return "\nWandering around the backside of the building, you stumble upon the entrance to the trash disposal shed of the " + getRest() + ". \n"
				+ "Ordinarily, this wouldn\'t be much to look at, the smell driving away most people from staying around. \n"
				+ "This night, however, the gate was open, swaying back and forth in the night wind. \n"
				+ "It seems an employee was too lax during the cleanup. \n"
				+ "Thinking that this is a prime opportunity, you move to the trashcans to scout out a potentially free meal. \n"
				+ "Just before you prepare to lift the lid of the surprisingly clean bin, you notice a glint of light reflecting off something laying on the ground. \n"
				+ "Forgetting about the trash, you turn to pick it up. \n"
				+ "It\'s a key labeled \'Back Door\'. \n"
				+ "Picking up the key, you pause for a moment to consider if what you are considering is the right thing to do. \n"
				+ "By the time your stomach answers for you with a growl, the door to the restaurant is already opened.\n";
	}
	
	public String oneThree() {
		return "\nDeciding that walking all the way here just to turn back at the first sign of struggle would be a waste, you decide to proceed into the store anyways. \n"
				+ "Picking up a sturdy slab of concrete broken off from the sidewalk, you toss the debris through the window with a resounding crack! \n"
				+ "Stepping through the broken window, you wince through the cuts from the broken glass and make your way through to the kitchen. \n"
				+ "Unsurprisingly, the door is locked shut, but a couple of good kicks bust in the swinging door. \n"
				+ "The process of cooking the food from the back wasn\'t hard, you turn on the grill and start cooking. \n"
				+ "As it turns out, you aren\'t half bad a cook despite your lack of experience. \n"
				+ "You might have been able to get a job here if you hadn\'t triggered the silent alarm the moment you broke the window and alerted the local police about the break-in. \n"
				+ "At least the cops had the decency to let you finish your 3rd and last burger. \n"
				+ "THE END.\n";
	}
	
	public String oneFour() {
		return "\nThe intensifying rumbling in your gut demands food, but with " + getRest() + " closed, you settle on going to a different restaurant. \n"
				+ "You rack your head and remember that the next closest restaurant was the McDonalds down the street. \n"
				+ "Your course set, you proceed onwards… until the outline of a familiar building appears in the distance after an hour of walking. \n"
				+ "It can\'t be. \n"
				+ "Running up to the building you discover that it is the same " + getRest() + " building. \n"
				+ "Wait, how could this be? \n"
				+ "Hadn\'t you just left the area to get food elsewhere? \n"
				+ "Believing that you had simply taken a wrong turn somewhere, you turn around and backtrack, hoping to reach the McDonalds. \n"
				+ "Unfortunately, the sight of " + getRest() + " greets you again, still closed. \n"
				+ "How. \n"
				+ "How. \n"
				+ "Why? \n"
				+ "You try to run back home. \n"
				+ "You might have to deal with homework, but at least whatever is going on would stop. \n"
				+ "No luck. \n"
				+ "You don’t understand. \n"
				+ "All roads are leading back to " + getRest() + ". \n"
				+ "You lay down on the ground, struggling to comprehend what is happening to you. \n"
				+ "Even as hunger overtakes you and your senses shut down one by one, your mind still struggles to understand. \n"
				+ "THE END.\n";
	}
	
	public String scenario2() {
		return "\n\nGently, you close the rear entrance door behind you and step into the rear kitchen of the " + getRest() + ". \n"
				+ "\"Finally,\" you say to yourself, \"I can eat!\" \n"
				+ "You turn on the grill to cook up some yummy food, and very nearly succeed until you hear the clinking of something metallic chime behind you. \n"
				+ "Turning around, you spot someone dressed in all black looking down at his waist at a pair of throwing knives in annoyance. \n"
				+ "It looks like something straight out of a fantasy novel, but there is a genuine ninja standing before you. \n"
				+ "Thankfully, your quick reaction speed lets you get a head start in running away from the ninja. \n"
				+ "You need to decide on what to do quickly, the footsteps of the ninja are not that far away from you. \n"
				+ "You decide to. . .\n"
				+ "1) Continue running forward\n"
				+ "2) Double-back towards the ninja\n"
				+ "3) Hide in the bathroom\n"
				+ "4) Duck back through the back door\n"
				+ "(Please type the number of the choice you want to take): ";
	}
	
	public String twoOne() {
		return "\nSeeing no other option available, you decide to plow ahead and get as much distance between you and the ninja as possible. \n"
				+ "You continue running forward in the direction of the front door, and rejoice as you are a mere moment away from freedom. \n"
				+ "THUNK! \n"
				+ "Turns out in your panic to escape, you forgot that the front door was locked tight. \n"
				+ "The world is quick to remind you, though, as you lay there dazed on the ground. \n"
				+ "Nothing you can\'t shake off though! \n"
				+ "You struggle to your knees and make an attempt to unlock the door when suddenly something hard hits you in the back of the head. \n"
				+ "Ah right, the ninja. \n"
				+ "Seems this is the end for you after all, ah well. \n"
				+ "THE END.\n";
	}
	
	public String twoTwo() {
		return "\nIn a moment of brilliance, you decide to instead turn around and launch yourself into your assailant. \n"
				+ "Perhaps you wanted to throw them off their guard? \n"
				+ "Surprise them enough to gain the upper hand and then knock them out? \n"
				+ "In theory it is a decent option, given how fast ninja are from the TV shows you watch there is no way you could run faster than him. \n"
				+ "In practice, not so much. \n"
				+ "You failed to account for the amount of training the ninja probably had to go through to get his job as you bounce off of him. \n"
				+ "Turns out being sneaky isn’t enough to get the job of an unseen assassin, a perfectly fit body is needed as well. \n"
				+ "Compared to your weak teenager body, you don’t hold a candle. \n"
				+ "As such, it comes as no surprise when you feel the impact of multiple throwing knives against your body the next instant. \n"
				+ "Ah well, at least you tried! \n"
				+ "THE END!\n";
	}
	
	public String twoThree() {
		return "\nSeeing no other option, you make a break for the bathroom to hopefully hide from your pursuer. \n"
				+ "Shutting and locking the door behind you, you try to catch your breath. \n"
				+ "Quickly you try to formulate a plan to get out of here … until you hear the sound of jingling coming from the other side of the door. \n"
				+ "Of course! \n"
				+ "It would only make sense that a ninja bodyguard for a restaurant would have the keys to every door in the building. "
				+ "\'Oh well,\' you think to yourself as the door opens, \'Can\'t be helped.\' \n"
				+ "THE END.\n";
	}
	
	public String twoFour() {
		return "\nKnowing that the only available exit is the one you just opened, you dash to the back door. \n"
				+ "Thankfully, it opens without a hitch and you bolt past the opening. \n"
				+ "Dropping the key back on the ground outside, you dash through the trash area\'s gate and sprint down the sidewalk for a while, not daring to chance a glance backwards. \n"
				+ "It isn\'t until you make it past the parking lot that you look back to see the ninja’s position. \n"
				+ "Surprisingly, the ninja is standing at the front of the building, making no attempt to chase after you at all. \n"
				+ "Did he only care about the break in? \n"
				+ "Perhaps since he stopped you before you did anything else to the store\'s property he doesn’t see a reason to chase you any further. \n"
				+ "Either way, it seems like you made it out alive. \n"
				+ "Your hunger remains, but you are alive. \n"
				+ "As you walk back home, you make a solem resolution to yourself. \n"
				+ "You will go to Costco to buy groceries so that nothing like this can happen again! \n"
				+ "GOOD END!\n";
	}

	
}
