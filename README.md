1. Purpose of the Meal Suggestion App
------------------------------------------------------------------------------
The Meal Suggestion App purpose is to deliver meal recommendations for the consumer based on the specific time of day. The application recognizes the correlation between specific times of day and it can be used to help distinct dietary habits, help the consumers with the decision making process for end-users aiming to prepare meals. For example, the app generates wholesome breakfast options such as oatmeal or eggs on toast at dawn, suggests lighter meals like salads or wraps during lunchtime and recommends substantial evening meals such as stews or roasted vegetables. By utilising the current time the application optimizes user engagement in meal planning while promoting healthier dietary choices.
----------------------------------------------------------------------------------------------
2. Design Considerations
----------------------------------------------------------------------------------------------
In architecting the Meal Suggestion App, several vital parameters were prioritized to ensure optimal usability and functionality:
--------------------------------------------------------------------------------------------------
2.1 What was the use of the User Interface
-------------------------------------------------
The user interface (UI) was vital for the use of Kotlin programming language which is exceptionally compatible with Android system development. A pivotal component within this architecture is the timeInput value facilitating user entry of the current time. This input integrates fluidly with the suggestionText which is essential for the TextView element that dynamically displays meal recommendations based on user input. A particular focus was placed on establishing a clean and intuitive design aesthetic thereby enhancing user interaction with minimal friction.
------------------------------------------------------
2.2 Layout and User Experience
------------------------------------------------------
To amplify user functionality an XML Layout was employed for the app’s visual design. Various UI elements were systematically implemented:
-----------------------------------------------------------
Button: This multifunctional element not only triggers the meal suggestion logic but also includes a reset capability that erases previous suggestions allowing users to initiate a fresh query without the need for application restart.
----------------------------------------------------------------------
TextView: This component efficiently conveys meal suggestions to users ensuring clarity and readability in output.
--------------------------------------------------------------------------
EditText: This functionality allows users to input their desired time enabling a tailored experience. The EditText is structured to accept user inputs smoothly thereby streamlining interaction.
---------------------------------------------------------------------
3. GitHub Utilization and GitHub Actions Integration
----------------------------------------------------------
To enhance collaborative development and optimize workflow, GitHub was selected as the version control system for the Meal Suggestion App. This choice provides several advantages:
-------------------------------------------------------------
3.1 Code Collaboration and Management
--------------------------------------------------------------
GitHub enables developers to concurrently progress without the risk of code conflicts. Through branching strategies developers can explore new features or implement enhancements in isolation from the main codebase. Initiating pull requests allows for peer code review, promoting team discussions on changes, identifying potential issues and ensuring adherence to coding standards prior to integration.
----------------------------------------------------------------
3.2 Continuous Integration and Deployment via GitHub Actions
---------------------------------------------------------------
To facilitate automated testing and deployment, GitHub Actions was integrated into the development workflow. This continuous integration framework automates the processes of building, testing and deploying the application in response to code changes pushed to the repository. By employing automated workflows that trigger based on events such as pull requests or commits, developers ensure that the application remains in a state suitable for deployment at all times.
----------------------------------------------------------------
For instance, should a new feature regarding meal recommendations be introduced, GitHub Actions can automatically compile the application and execute predefined test suites to confirm that the new code performs as expected. This continuous integration methodology enhances software quality and accelerates the development lifecycle.
------------------------------------------------------------------------
Conclusion
-----------------------------------------
The Meal Suggestion App operates as a sophisticated tool designed to enhance culinary decision-making grounded in temporal context. Through deliberate design choices, including an intuitive interface crafted with Kotlin and XML, the application promisingly simplifies user interactions and optimizes accessibility. Furthermore the strategic utilisation of GitHub and GitHub Actions fosters collaborative and efficient development practices ensuring the application remains resilient and responsive to user requirements. Collectively these initiatives culminate in an invaluable resource empowering users to make informed meal choices with ease.

Links for the Youtube Video:

https://youtube.com/watch?v=Dy7AJs7r6pY&si=z-251I3TMgi9VBGc

Links for Github:

https://github.com/mikethornton-28w/Mealsuggestion
