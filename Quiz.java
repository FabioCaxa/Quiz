public class Quiz {
	public static void main (String [] args){
		Question question0 = new TrueFalseQuestion("An octopus has 3 hearts","Y");
		question0.check();

		Question question1 = new TrueFalseQuestion("CSS stands for Combined Style Sheet","N");
		question1.check();

		Question question2 = new TrueFalseQuestion("Mithrandir is the elven name of Gandalf in Lord of the Rings","Y");
		question2.check();

		Question question3 = new TrueFalseQuestion("Leonardo DiCaprio never won an Oscar","N");
		question3.check();

		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("Where is the 2022 World Cup being played?",
		"Brazil",
		"Qatar",
		"United States",
		"On Twitter",
		"Africa", "B");
		question4.check();

		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion("Where is Brazil Located?",
		"America",
		"Asia",
		"Oceania",
		"Africa",
		"None of the above", "A");
		question5.check();

		MultipleChoiceQuestion question6 = new MultipleChoiceQuestion("What is the name of the new King of England?",
		"Fredrick",
		"Alfred",
		"Robert",
		"Patrick",
		"Charles", "E");
		question6.check();

		MultipleChoiceQuestion question7 = new MultipleChoiceQuestion("What instrument J.S.Bach is known for?",
		"Violin",
		"Mandolin",
		"Piano",
		"Clavier",
		"Theremin", "D");
		question7.check();

		MultipleChoiceQuestion question8 = new MultipleChoiceQuestion("Who were the members of the band The Beatles?",
		"Paul, Ringo, Stanley and Tony",
		"Alfredo, Hector, Luis and Nacho",
		"John, Ringo, George and Paul",
		"Patrick Bateman, Leatherface, Jason and Freddie Krueger",
		"Tony Start, Steve Rogers, Nick Fury and Black Widow", "C");
		question8.check();

		Question.showResults();
	}
}