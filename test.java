import javax.swing.JOptionPane;
public class test {
// SWITCH Statements GUI
	public static void main(String[]args) {	String k = "y";
		while(k=="y") {
	String inp= JOptionPane.showInputDialog("Enter first letter of your fav persons name");
	String name = inp.toLowerCase(); // converts to lower case
	switch(name){
	case "a":
		JOptionPane.showMessageDialog(null,"These people are their very own individuals: \n eager and freethinking."
				+ " They don’t alter their opinion under another person’s weight. A born leader,\n"
				+ " they need to be in control and need a reason. They have strength and bravery,"
				+ " \nyet ensure they’re likewise adaptable and consider other individuals’ thoughts important.");
		break;
	case "b":JOptionPane.showMessageDialog(null,"They are delicate and loners, yet at the same time figure out \n"
			+ "how to be affable and sympathetic. They are about harmony as they require it to be generally joyful\n."
			+ " Despite the fact that they are extremely steadfast, make a point to keep a receptive outlook and think\n"
			+ " for themselves all the more regularly.");break;
	case "d":JOptionPane.showMessageDialog(null, "These are people with a down to earth way of thinking./n"
			+ " Their rational thinking and analytical skills help them find the best methods for solving any sort of issue.\n"
			+ " Their iron will helps along the way as well\n."
			+ " These people work best under the stress of a situation.\n");break;
	case "e":JOptionPane.showMessageDialog(null, "These are people who enjoy freedom.\n "
			+ "In a sense, they are nomads. They enjoy exploration, adventure and romance\n."
			+ " They love falling in love and are the first in the crowd at parties. \n"
			+ "They also have the ability to analyze every side of a story\n.");break;
	case "f":JOptionPane.showMessageDialog(null, "These people have all the qualities of a caretaker.\n"
			+ " They’re capable of giving up a multitude of things in order to help others.\n "
			+ "The love they have to offer will come a great way in aiding others and patching up their emotional wounds.\n"
			+ " They should take care as these endeavors can weigh heavily on the soul.\n");break;
	case "g":JOptionPane.showMessageDialog(null, "The minds of these people are what shines most in them. \n"
			+ "They are capable of great feats when it comes to problem solving and coming up with amazing methods to make money.\n"
			+ " Usually they’ll be found to have great rational thinking.\n");break;
	case "h":JOptionPane.showMessageDialog(null, "The imagination of these people knows no bounds.\n"
			+ " The methods they come up with are brilliant for making lots of money. At the same time, they have great methods \nfor losing lots of money fast. It’s a 50/50 scenario."
			+ " They tend to be loners that trust their instincts and that love nature.\n");break;
	case "i":JOptionPane.showMessageDialog(null, "These are people with highly developed emotions that have a knack for art.\n Anything from fashion to composition, even sculpting and all the in between goes for them."
			+ " Keeping determined is important in order to keep negative emotions\n and anxiousness at bay.");break;
	case "j":JOptionPane.showMessageDialog(null, "This person is a holy knight that \nprotects the harmony of the world."
			+ " They can make the best of friends and will always strive to bring joy \nto those around them."
			+ " Motivating one’s own self is key to developing one’s latent abilities.\n"
			+ "\n");break;
	case "k":JOptionPane.showMessageDialog(null, "There people are all about wisdom and insight and prefer to make\n decisions based on instinct."
			+ " They are emotional beings that are drawn to art. \n"
			+ "Caution should be exerted in regards to anxiety as they are prone to it.\n");break;
	case "l":JOptionPane.showMessageDialog(null, "The biggest issue these people have is spending too much \nenergy on second thoughts which will push them towards missing opportunities."
			+ " They are filled with a love for travel and have a warm soul that cares for all.\n"
			+ " They ought to build harmony in their lives in order to avoid anxiousness.\n");break;
	case "m":JOptionPane.showMessageDialog(null, "Fanatics of work. That’s an easy description for these people.\n"
			+ " Rest is of no importance to them as they live and breathe work. Their character is defined by their strong\n will and they are built for creating a comforting home and will require a steady income."
			+ " They ought to take care and not become restless with those around them.\n");break;
	case "n":JOptionPane.showMessageDialog(null, "These are people with an inventive way of thinking that approach life efficiently\n and methodically."
			+ " Their endeavors are often written down in paper form, often in diaries and they are bound to have their fair share of\n romance in their lives.");
	case "o":JOptionPane.showMessageDialog(null, "This person is deeply rooted in emotions and has a well-developed sense of morality, \nstrengthened by well-defined regulations. "
			+ "These people also tend to show romantical envy and ought to take care not to become too negative.\n");break;
	case "p":JOptionPane.showMessageDialog(null, "Intellect comes flooding for these people which will impress most of the ones\n that come in contact with them."
			+ " An issue would be that they often seem aloof. They might get focused on the negative side of things too often but\n they simply need to relax and spend their time in a more carefree manner from time to time.");
	case "q":JOptionPane.showMessageDialog(null, "Money comes easily to these people, but they are prone to losing it just as easily \ndue to their volatile decision making. "
			+ "Leadership is a common talent for these people. Others might often talk behind this person’s \nback;"
			+ " however, they will often be surprised by how straightforward and diplomatic this person can be when the truth comes out.\n");break;
	case "r":JOptionPane.showMessageDialog(null, "The gentleness of these people’s soul exudes in a brilliant manner.\n "
			+ "They are great and efficient at work and will bring their energy into everything they do.\n"
			+ " Keeping the harmony in working with others is a must for them.\n");break;
	case "s":JOptionPane.showMessageDialog(null, "Highly committed from an emotional standpoint, these people are charismatic and feel things deeply.\n This in turn can bring some drama in their lives."
			+ " Analyzing situations before taking rash decisions is highly advised.\n");break;
	case "t":JOptionPane.showMessageDialog(null, "Life for these people can become rather fast and furious.\n"
			+ " That’s just how they like to live, however this might push them into taking one too many projects \nupon themselves which can in turn exhaust them. Their nature makes them seem too pushy and authoritative."
			+ " Keeping things balanced in their life and behavior is strongly advised.\n");break;
	case "u":JOptionPane.showMessageDialog(null, "Things come and go with this person. \n"
			+ "They will often come to realize that they have a great deal of things only to later lose them.\n Adaptability and quick decision making are prerequisites for them in order to make the best of life. Devoting themselves to a well-chosen purpose and goal is paramount to feeling fulfilled."
			+ " Good thing they tend to be good at taking advantage of situations.\n");break;
	case "v":JOptionPane.showMessageDialog(null, "These people can predict the future with simple intuition.\n"
			+ " It almost seems as if they’re clairvoyant. Their minds brim with originality and it \nmight be difficult for them to separate dreams from reality however they have all the tools to turn their thoughts into facts."
			+ " They are highly competent however they might fall into negativity.\n");break;
	case "w":JOptionPane.showMessageDialog(null, "These people take decisions based off of their instinct\n. "
			+ "The gears of their mind are always into overdrive, constantly making adequate decisions for the multiple endeavors\n they drown themselves in."
			+ " They are charismatic and people fly towards them like a butterfly towards a pretty flower.\n");break;
	case "x":JOptionPane.showMessageDialog(null, "This person’s mind is a storage cellar for information. \n"
			+ "They are deeply emotional and overly excited about life however this usually doesn’t transpose \nin their sex life. "
			+ "Their emotional sensitivity makes them predisposed to being easily influenced and might fall into\n vices quite often.");break;
	case "y":JOptionPane.showMessageDialog(null, "Indiana Jones has nothing on these people’s love for adventure.\n"
			+ " Freedom is a must for them and they often come as ambitious and tend to be self-sufficient people.\n"
			+ " Being fast on their feet is a must so that they might take proper and efficient decisions quickly.\n");break;
	case "z":JOptionPane.showMessageDialog(null, "Affection and love come easy for these people.\n"
			+ " Their lives are fast paced and they easily attract people towards them with their carefree and loving nature\n. "
			+ "They are highly rational and comprehend things quite easily, however they might fall into taking hasty decisions\n.");break;
	case "c":JOptionPane.showMessageDialog(null, "Highly sensitive and emotional, these people have a way with comprehending the spirit of mankind like \nnone other."
			+ " They communicate their opinions with ease and\n "
			+ "always make a joke out of the worst situations.");
	case "1":
		JOptionPane.showMessageDialog(null,"Please enter an alphabet");break;
	case "2":
		JOptionPane.showMessageDialog(null,"Please enter an alphabet");break;
	case "3":
		JOptionPane.showMessageDialog(null,"Please enter an alphabet");break;
	case "4":
		JOptionPane.showMessageDialog(null,"Please enter an alphabet");break;
	case "5":
		JOptionPane.showMessageDialog(null,"Please enter an alphabet");break;
	case "6":
		JOptionPane.showMessageDialog(null,"Please enter an alphabet");break;
	case "7":
		JOptionPane.showMessageDialog(null,"Please enter an alphabet");break;
	case "8":
		JOptionPane.showMessageDialog(null,"Please enter an alphabet");break;
	case "9":
		JOptionPane.showMessageDialog(null,"Please enter an alphabet");break;
	case "0":
		JOptionPane.showMessageDialog(null,"Please enter an alphabet");break;
	} 
	k= JOptionPane.showInputDialog("Do You Want To Contimue \n[y/n]");
	JOptionPane.showMessageDialog(null, "Exiitng \n data from nameecho.com");
	}}}
