package org.example.data;

import org.example.classes.Question;

public class QuestionProvider {

    public Question[] generateQuestions() {

        Question question = new Question("Which planet is known as the Red Planet?", new String[]{"Venus", "Mars", "Jupiter", "Saturn"}, 2);

        Question question2 = new Question("Who painted the Mona Lisa?",
                new String[]{"Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Michelangelo"},
                0);

        Question question3 = new Question("What is the capital city of Australia?",
                new String[]{"Sydney", "Melbourne", "Canberra", "Brisbane"},
                2);

        Question question4 = new Question("What is the chemical symbol for gold?",
                new String[]{"Au", "Ag", "Fe", "Cu"},
                0);

        Question question5 = new Question("Who wrote the novel \"Pride and Prejudice\"?",
                new String[]{"Jane Austen", "William Shakespeare", "Charles Dickens", "F. Scott Fitzgerald"},
                0);

        Question question6 = new Question("What is the largest ocean on Earth?",
                new String[]{"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"},
                3);

        Question question7 = new Question("Which country is famous for the Taj Mahal?",
                new String[]{"India", "Egypt", "China", "Italy"},
                0);

        Question question8 = new Question("How many players are there on a basketball team?",
                new String[]{"5", "6", "7", "8"},
                0);

        Question question9 = new Question("Who is the CEO of Tesla?",
                new String[]{"Elon Musk", "Bill Gates", "Jeff Bezos", "Mark Zuckerberg"},
                0);

        Question question10 = new Question("Which continent is home to the Amazon Rainforest?",
                new String[]{"South America", "Africa", "Asia", "North America"},
                0);

        Question question11 = new Question("What is the largest organ in the human body?",
                new String[]{"Liver", "Heart", "Skin", "Brain"},
                2);

        Question question12 = new Question("Who is the author of \"Harry Potter\" series?",
                new String[]{"J.R.R. Tolkien", "J.K. Rowling", "C.S. Lewis", "George R.R. Martin"},
                1);

        Question question13 = new Question("What is the chemical symbol for oxygen?",
                new String[]{"O", "Au", "Ag", "C"},
                0);

        Question question14 = new Question("Which country is famous for the Great Wall?",
                new String[]{"China", "Italy", "Greece", "France"},
                0);

        Question question15 = new Question("Who discovered penicillin?",
                new String[]{"Alexander Fleming", "Thomas Edison", "Isaac Newton", "Albert Einstein"},
                0);

        Question question16 = new Question("Which animal is known as the \"King of the Jungle\"?",
                new String[]{"Tiger", "Elephant", "Lion", "Gorilla"},
                2);

        Question question17 = new Question("What is the largest planet in our solar system?",
                new String[]{"Venus", "Mars", "Jupiter", "Saturn"},
                2);

        Question question18 = new Question("Who painted the \"Sistine Chapel\" ceiling?",
                new String[]{"Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Michelangelo"},
                3);
        Question question19 = new Question("What is the currency of Japan?",
                new String[]{"Yen", "Euro", "Dollar", "Pound"},
                0);

        Question question20 = new Question("Who invented the telephone?",
                new String[]{"Alexander Graham Bell", "Thomas Edison", "Nikola Tesla", "Isaac Newton"},
                0);

        Question question21 = new Question("Which country is famous for the Eiffel Tower?",
                new String[]{"France", "United States", "Germany", "United Kingdom"},
                0);

        Question question22 = new Question("How many bones are there in the human body?",
                new String[]{"206", "212", "198", "194"},
                0);

        Question question23 = new Question("Who is the lead singer of the band \"Coldplay\"?",
                new String[]{"Chris Martin", "Bono", "Freddie Mercury", "Mick Jagger"},
                0);

        Question question24 = new Question("What is the chemical symbol for sodium?",
                new String[]{"Na", "K", "Sn", "Si"},
                0);

        Question question25 = new Question("Which city is famous for the Statue of Liberty?",
                new String[]{"New York City", "Washington D.C.", "Los Angeles", "Chicago"},
                0);

        Question question26 = new Question("Who painted the \"Starry Night\"?",
                new String[]{"Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Michelangelo"},
                0);

        Question question27 = new Question("What is the capital city of Canada?",
                new String[]{"Ottawa", "Toronto", "Montreal", "Vancouver"},
                0);

        Question question28 = new Question("Which planet is known as the \"Giant of our Solar System\"?",
                new String[]{"Venus", "Mars", "Jupiter", "Saturn"},
                2);

        Question question29 = new Question("Who wrote the play \"Romeo and Juliet\"?",
                new String[]{"William Shakespeare", "Jane Austen", "Charles Dickens", "F. Scott Fitzgerald"},
                0);

        Question question30 = new Question("How many colors are there in a rainbow?",
                new String[]{"6", "7", "8", "5"},
                1);

        Question[] questions = {
                question, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12, question13, question14, question15, question16, question17, question18, question19, question20, question21, question22, question23, question24, question25, question26, question27, question28, question29, question30
        };


        return questions;

    }
}
