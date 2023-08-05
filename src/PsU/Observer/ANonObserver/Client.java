package PsU.Observer.ANonObserver;

//Driver class
public class Client {

    public static void main(String args[])
    {
        // Create objects for testing
        AverageScoreDisplay averageScoreDisplay =
                                       new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay =
                                       new CurrentScoreDisplay();
  
        // Pass the displays to Cricket data
        CricketData cricketData = new CricketData(currentScoreDisplay,
                                                  averageScoreDisplay);
  
        // In real app you would have some logic to call this
        // function when data changes
        cricketData.dataChanged();
    }

}

//Problems with above design:
//
//    CricketData holds references to concrete display element objects even though it needs to call only the update method of these objects. It has access to too much additional information than it requires.
//    This statement “currentScoreDisplay.update(runs,wickets,overs);” violates one of the most important design principle “Program to interfaces, not implementations.” as we are using concrete objects to share data rather than abstract interfaces.
//    CricketData and display elements are tightly coupled.
//    If in future another requirement comes in and we need another display element to be added we need to make changes to the non-varying part of our code(CricketData). This is definitely not a good design practice and application might not be able to handle changes and not easy to maintain.
//
//How to avoid these problems?
//Use Observer Pattern
