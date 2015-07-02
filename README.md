The application we’ll develop is a community entertainment service that allows users to
vote for contestants in events. Whether it’s a local talent show or this week’s episode of American
Idol (which allows viewers to vote on who they think is best), you can use this application
to register the event, and then vote on the contestants with your friends. When the event is
over, everyone can view the voting results. Given the popularity of American Idol and the
swarm of other television programs that use this format, most people should be familiar with
the features that need to be developed.
When interacting with the application, there will be very specific usage patterns. The first
is when a user wants to register a new, previously unknown event. In this scenario, the following
steps are taken:

1. Existing events are searched to see if the event already exists (this is optional, and the
user may just decide to go ahead without this step).

2. The user needs to log on (and register if not already registered).

3. An event is created that has a name, start time, end time, voting duration, and time
zone offset.

4. The contestants are added to the event.
After an event exists, it is visible for all users to view, and any user can vote on the event.

To vote on an event, the user follows these steps:
1. Log on (and register if they have not already).

2. Enroll in the event the user wants to vote on.

3. Vote for a contestant in the event.

Use Cases:



Register
Logon User
Logoff User

Update Profile
Upload Portrait to Profile

Create Event
Search for Events by Name
Search for Events by Location
Search for Events by Contestant
Publish Event Information
Enroll in an Event
Vote for a Contestant in an Event
Find Event Results

