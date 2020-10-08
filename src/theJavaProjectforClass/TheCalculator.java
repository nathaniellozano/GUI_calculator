/*
Created on March 20, 2019 at 11:50 A.M. Central Standard Time
*/
package theJavaProjectforClass;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheCalculator extends JFrame{
	private JButton ZeroButton, DecimalButton, EqualButton, OneButton,
		TwoButton, ThreeButton, FourButton, FiveButton, SixButton,
		SevenButton, EightButton, NineButton, AddButton, SubtractButton,
		MultiplyButton, DivideButton, ClearButton, ClearEntryButton, BackspaceButton;
	private JTextField TheOutput= new JTextField(20);
	private final int WINDOW_WIDTH= 307, WINDOW_HEIGHT= 440;
	private String PreviousSavedCurrentOutputEntity= "", CurrentOutput= "";
	
	public TheCalculator(){
		super ("The Basic Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int XAxis = (int) ((dimension.getWidth() - getWidth())/2);
		int YAxis = (int) ((dimension.getHeight() - getHeight())/2);
		setLocation(XAxis, YAxis);
		
		buildFrame();
		
		setVisible(true);
	}
	
	private void buildFrame(){
		ZeroButton= new JButton("0");
		DecimalButton= new JButton(".");
		EqualButton= new JButton("=");
		OneButton= new JButton("1");
		TwoButton= new JButton("2");
		ThreeButton= new JButton("3");
		FourButton= new JButton("4");
		FiveButton= new JButton("5");
		SixButton= new JButton("6");
		SevenButton= new JButton("7");
		EightButton= new JButton("8");
		NineButton= new JButton("9");
		AddButton= new JButton("+");
		SubtractButton= new JButton("-");
		MultiplyButton= new JButton("X");
		DivideButton= new JButton("Ã·");
		ClearButton= new JButton("C");
		ClearEntryButton= new JButton("CE");
		BackspaceButton= new JButton("DEL");
		
		TheOutput.setSize(272, 50);
		TheOutput.setLocation(10, 10);
		ClearEntryButton.setSize(60, 55);
		ClearEntryButton.setLocation(10, 70);
		ClearButton.setSize(60, 55);
		ClearButton.setLocation(80, 70);
		BackspaceButton.setSize(60, 55);
		BackspaceButton.setLocation(150, 70);
		DivideButton.setSize(60, 55);
		DivideButton.setLocation(220, 70);
		SevenButton.setSize(60, 55);
		SevenButton.setLocation(10, 135);
		EightButton.setSize(60, 55);
		EightButton.setLocation(80, 135);
		NineButton.setSize(60, 55);
		NineButton.setLocation(150, 135);
		MultiplyButton.setSize(60, 55);
		MultiplyButton.setLocation(220, 135);
		FourButton.setSize(60, 55);
		FourButton.setLocation(10, 200);
		FiveButton.setSize(60, 55);
		FiveButton.setLocation(80, 200);
		SixButton.setSize(60, 55);
		SixButton.setLocation(150, 200);
		SubtractButton.setSize(60, 55);
		SubtractButton.setLocation(220, 200);
		OneButton.setSize(60, 55);
		OneButton.setLocation(10, 265);
		TwoButton.setSize(60, 55);
		TwoButton.setLocation(80, 265);
		ThreeButton.setSize(60, 55);
		ThreeButton.setLocation(150, 265);
		AddButton.setSize(60, 55);
		AddButton.setLocation(220, 265);
		ZeroButton.setSize(130, 55);
		ZeroButton.setLocation(10, 330);
		DecimalButton.setSize(60, 55);
		DecimalButton.setLocation(150, 330);
		EqualButton.setSize(60, 55);
		EqualButton.setLocation(220, 330);
		
		ZeroButton.addActionListener(new ZeroButtonListener());
		DecimalButton.addActionListener(new DecimalButtonListener());
		EqualButton.addActionListener(new EqualButtonListener());
		OneButton.addActionListener(new OneButtonListener());
		TwoButton.addActionListener(new TwoButtonListener());
		ThreeButton.addActionListener(new ThreeButtonListener());
		FourButton.addActionListener(new FourButtonListener());
		FiveButton.addActionListener(new FiveButtonListener());
		SixButton.addActionListener(new SixButtonListener());
		SevenButton.addActionListener(new SevenButtonListener());
		EightButton.addActionListener(new EightButtonListener());
		NineButton.addActionListener(new NineButtonListener());
		AddButton.addActionListener(new AddButtonListener());
		SubtractButton.addActionListener(new SubtractButtonListener());
		MultiplyButton.addActionListener(new MultiplyButtonListener());
		DivideButton.addActionListener(new DivideButtonListener());
		ClearEntryButton.addActionListener(new ClearEntryButtonListener());
		ClearButton.addActionListener(new ClearButtonListener());
		BackspaceButton.addActionListener(new BackspaceButtonListener());
		
		add(TheOutput);
		add(ClearEntryButton);
		add(ClearButton);
		add(BackspaceButton);
		add(SevenButton);
		add(EightButton);
		add(NineButton);
		add(MultiplyButton);
		add(DivideButton);
		add(FourButton);
		add(FiveButton);
		add(SixButton);
		add(SubtractButton);
		add(OneButton);
		add(TwoButton);
		add(ThreeButton);
		add(AddButton);
		add(ZeroButton);
		add(DecimalButton);
		add(EqualButton);
	}
	
	private class ZeroButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + "0");
		}
	}
	private class DecimalButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + ".");
		}
	}
	private class EqualButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			String Word= "", CurrentOutputResetBackTo= "";
			char OutputCharacterArray[]= CurrentOutput.toCharArray();
			
			if (OutputCharacterArray.length >= 1){
				for (int Position= 0; Position < OutputCharacterArray.length; Position++){
					if ((OutputCharacterArray[Position] == '+') || (OutputCharacterArray[Position] == '-')
							|| (OutputCharacterArray[Position] == 'x') || (OutputCharacterArray[Position] == 'X')
							|| (OutputCharacterArray[Position] == '*') || (OutputCharacterArray[Position] == '/')
							|| (OutputCharacterArray[Position] == 'Ã·') || (OutputCharacterArray[Position] == 'â�„')
							|| (OutputCharacterArray[Position] == 'âˆ•') || (OutputCharacterArray[Position] == 'Ì·')
							|| OutputCharacterArray[Position] == ' '){
						Word+= OutputCharacterArray[Position];
						CurrentOutputResetBackTo+= Word;
						Word= "";
					}
					else if((OutputCharacterArray[Position] == 'âˆž') || (OutputCharacterArray[Position] == '0')
							|| (OutputCharacterArray[Position] == '1') || (OutputCharacterArray[Position] == '2')
							|| (OutputCharacterArray[Position] == '3') || (OutputCharacterArray[Position] == '4')
							|| (OutputCharacterArray[Position] == '5') || (OutputCharacterArray[Position] == '6')
							|| (OutputCharacterArray[Position] == '7') || (OutputCharacterArray[Position] == '8')
							|| (OutputCharacterArray[Position] == '9') || (OutputCharacterArray[Position] == 'Â¼')
							|| (OutputCharacterArray[Position] == 'Â½') || (OutputCharacterArray[Position] == 'Â¾')
							|| (OutputCharacterArray[Position] == 'â…“') || (OutputCharacterArray[Position] == 'â…”')
							|| (OutputCharacterArray[Position] == 'â…•') || (OutputCharacterArray[Position] == 'â…–')
							|| (OutputCharacterArray[Position] == 'â…—') || (OutputCharacterArray[Position] == 'â…˜')
							|| (OutputCharacterArray[Position] == 'â…™') || (OutputCharacterArray[Position] == 'â…š')
							|| (OutputCharacterArray[Position] == 'â…›') || (OutputCharacterArray[Position] == 'â…œ')
							|| (OutputCharacterArray[Position] == 'â…�') || (OutputCharacterArray[Position] == 'â…ž')
							|| (OutputCharacterArray[Position] == 'â…Ÿ') || (OutputCharacterArray[Position] == '.'))
						Word+= OutputCharacterArray[Position];
				}
				if ((OutputCharacterArray[OutputCharacterArray.length-1] == '+') 
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == '-')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'x')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'X')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == '*')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == '/')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'Ã·')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'â�„')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'âˆ•')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'Ì·')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == ' '))
					CurrentOutputResetBackTo= CurrentOutputResetBackTo.substring(0, CurrentOutputResetBackTo.length()-1);
				
				PreviousSavedCurrentOutputEntity= CurrentOutputResetBackTo;
				
				OutputCharacterArray= PreviousSavedCurrentOutputEntity.toCharArray();
				int Position= 0, Position2= 0, FractionCarrierPresent= 0;
				double FirstNumber= 0, SecondNumber= 0;
				String FirstNumberString= "", SecondNumberString= "", FirstHalfofExpressionHolder= "", SecondHalfofExpressionHolder= "";
				char character= 0, FractionCarrier1= 0, FractionCarrier2= 0;
				boolean FirstNumberFound= false, SecondNumberFound= false, CalculationFailed= true;
				
				while (PreviousSavedCurrentOutputEntity.length() != 0){
					for (Position= 0; ((Position < OutputCharacterArray.length) && (!CalculationFailed)); Position++){
						character= OutputCharacterArray[Position];
						if ((character == 'x') || (character == 'X') || (character == '*')){
							Position2= Position;
							FirstNumberString= "";
							SecondNumberString= "";
							FirstNumberFound= false;
							SecondNumberFound= false;
							
							while ((Position2!= -1) && (!FirstNumberFound)){
								character= OutputCharacterArray[Position2];
								if (!FirstNumberFound){
									if (Character.isDigit(character))
										Position2--;
									else if ((character == 'Â¼') || (character == 'Â½') || (character == 'Â¾')
											|| (character == 'â…“') || (character == 'â…”') || (character == 'â…•')
											|| (character == 'â…–') || (character == 'â…—') || (character == 'â…˜')
											|| (character == 'â…™') || (character == 'â…š') || (character == 'â…›')
											|| (character == 'â…œ') || (character == 'â…�') || (character == 'â…ž')
											|| (character == 'â…Ÿ')) {
										FractionCarrier1= character;
										FractionCarrierPresent= 1;
										FirstNumberFound= true;
									}
									else if (character == 'âˆž'){
										FirstNumber= Double.POSITIVE_INFINITY;
										FirstNumberFound= true;
									}
									else if (character == ' ')
										Position2--;
									else if ((Position2 == 0) && (Character.isDigit(character))){
										while ((character!= ' ') || (character!= 'x') || (character!= 'X')
												|| (character!= '*')){
											FirstNumberString+= character;
											Position2++;
										}
										FirstNumberFound= true;
									}
									else
										Position2--;
								}
							}
							if (!FirstNumberFound){
								CalculationFailed= true;
								break;
							}
							
							if (!CalculationFailed){
								while (Position2!= -1){
									FirstHalfofExpressionHolder+= OutputCharacterArray[Position2];
									Position2--;
								}
								
								Position2= Position;
								while ((Position2 != OutputCharacterArray.length) && (!SecondNumberFound)){
									character= OutputCharacterArray[Position2];
									if (!SecondNumberFound){
										if (Character.isDigit(character)){
											while ((character != ' ') || (character != 'x') || (character != 'X')
													|| (character != '*') || (character != '+') || (character != '-')
													|| (character != 'Ã·') || (character != 'â�„') || (character != 'âˆ•')
													|| (character != 'Ì·') || (Position2 != OutputCharacterArray.length)){
												FirstNumberString+= character;
												Position2++;
											}
										}
										else if ((character == 'Â¼') || (character == 'Â½') || (character == 'Â¾')
												|| (character == 'â…“') || (character == 'â…”') || (character == 'â…•')
												|| (character == 'â…–') || (character == 'â…—') || (character == 'â…˜')
												|| (character == 'â…™') || (character == 'â…š') || (character == 'â…›')
												|| (character == 'â…œ') || (character == 'â…�') || (character == 'â…ž')
												|| (character == 'â…Ÿ')) {
											FractionCarrier1= character;
											if (FractionCarrierPresent == 1)
												FractionCarrierPresent= 3;
											else
												FractionCarrierPresent= 2;
											SecondNumberFound= true;
										}
										else if (character == 'âˆž'){
											FirstNumber= Double.POSITIVE_INFINITY;
											FirstNumberFound= true;
										}
										else if (character == ' ')
											Position2++;
										else
											Position2++;
									}
								}
								if (!SecondNumberFound)
									CalculationFailed= true;
							}
						}
					}
				}
				if (!CalculationFailed)
					TheOutput.setText("An error has occured!");
			}
			else
				TheOutput.setText("");
		}
	}
	private class OneButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + "1");
		}
	}
	private class TwoButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + "2");
		}
	}
	private class ThreeButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + "3");
		}
	}
	private class FourButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + "4");
		}
	}
	private class FiveButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + "5");
		}
	}
	private class SixButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + "6");
		}
	}
	private class SevenButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + "7");
		}
	}
	private class EightButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + "8");
		}
	}
	private class NineButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + "9");
		}
	}
	private class AddButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + " + ");
		}
	}
	private class SubtractButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + " - ");
		}
	}
	private class MultiplyButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + " X ");
		}
	}
	private class DivideButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			TheOutput.setText(CurrentOutput + " Ã· ");
		}
	}
	private class ClearEntryButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			String Word= "", CurrentOutputResetBackTo= "";
			char OutputCharacterArray[]= CurrentOutput.toCharArray();
			
			if (OutputCharacterArray.length >= 1){
				for (int Position= 0; Position < OutputCharacterArray.length; Position++){
					if ((OutputCharacterArray[Position] == '+') || (OutputCharacterArray[Position] == '-')
							|| (OutputCharacterArray[Position] == 'x') || (OutputCharacterArray[Position] == 'X')
							|| (OutputCharacterArray[Position] == '*') || (OutputCharacterArray[Position] == '/')
							|| (OutputCharacterArray[Position] == 'Ã·') || (OutputCharacterArray[Position] == 'â�„')
							|| (OutputCharacterArray[Position] == 'âˆ•') || (OutputCharacterArray[Position] == 'Ì·')
							|| OutputCharacterArray[Position] == ' '){
						Word+= OutputCharacterArray[Position];
						CurrentOutputResetBackTo+= Word;
						Word= "";
					}
					else if((OutputCharacterArray[Position] == 'âˆž') || (OutputCharacterArray[Position] == '0')
							|| (OutputCharacterArray[Position] == '1') || (OutputCharacterArray[Position] == '2')
							|| (OutputCharacterArray[Position] == '3') || (OutputCharacterArray[Position] == '4')
							|| (OutputCharacterArray[Position] == '5') || (OutputCharacterArray[Position] == '6')
							|| (OutputCharacterArray[Position] == '7') || (OutputCharacterArray[Position] == '8')
							|| (OutputCharacterArray[Position] == '9') || (OutputCharacterArray[Position] == 'Â¼')
							|| (OutputCharacterArray[Position] == 'Â½') || (OutputCharacterArray[Position] == 'Â¾')
							|| (OutputCharacterArray[Position] == 'â…“') || (OutputCharacterArray[Position] == 'â…”')
							|| (OutputCharacterArray[Position] == 'â…•') || (OutputCharacterArray[Position] == 'â…–')
							|| (OutputCharacterArray[Position] == 'â…—') || (OutputCharacterArray[Position] == 'â…˜')
							|| (OutputCharacterArray[Position] == 'â…™') || (OutputCharacterArray[Position] == 'â…š')
							|| (OutputCharacterArray[Position] == 'â…›') || (OutputCharacterArray[Position] == 'â…œ')
							|| (OutputCharacterArray[Position] == 'â…�') || (OutputCharacterArray[Position] == 'â…ž')
							|| (OutputCharacterArray[Position] == 'â…Ÿ') || (OutputCharacterArray[Position] == '.'))
						Word+= OutputCharacterArray[Position];
				}
				if ((OutputCharacterArray[OutputCharacterArray.length-1] == '+') 
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == '-')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'x')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'X')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == '*')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == '/')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'Ã·')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'â�„')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'âˆ•')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == 'Ì·')
						|| (OutputCharacterArray[OutputCharacterArray.length-1] == ' '))
					CurrentOutputResetBackTo= CurrentOutputResetBackTo.substring(0, CurrentOutputResetBackTo.length()-1);
				
				PreviousSavedCurrentOutputEntity= CurrentOutputResetBackTo;
				
				TheOutput.setText(PreviousSavedCurrentOutputEntity);
			}
			else
				TheOutput.setText("");
		}
	}
	private class ClearButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			TheOutput.setText("");
		}
	}
	private class BackspaceButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent Event){
			CurrentOutput= TheOutput.getText();
			
			if (CurrentOutput.length() >= 2)
				TheOutput.setText(CurrentOutput.substring(0, CurrentOutput.length()-1));
			else
				TheOutput.setText("");
		}
	}
}