Sample story

Narrative:
In order to test the android application
As a programmer
I want to use Behaviour-Driven Development

Lifecycle:
Before:
Given gvidon
					
Scenario: Testing David button click
Given run the application
When I click on the button with name David
Then text editor with name David_T should be DavidMher
								 							 
Scenario:  Testing write text in Max.apk
When I input 7
Then text editor with this id Mher_TEXT should be 7

Scenario: Testing button click
When I click on the button with <id>
Then text editor whith id Mher_TEXT should be <Text>

Examples:
max/story/story.table