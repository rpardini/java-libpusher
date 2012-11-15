Pusher Java classes
=========================================

This Java classes can be used to communicate very easily with the Pusher REST API (http://www.pusherapp.com) from any Java application that uses Apache http-commons.

Get Started
-----------
First create a Pusher object with your app information:

	Pusher pusher = new Pusher("yourAppId", yourAppKey", "yourAppSecret"); 
	
Call one of the "triggerPush" and pass channel name, event name and the message body (JSON encoded data) as parameters:
	
	pusher.triggerPush("test_channel", "my_event", jsonData);
	
The second "triggerPush" method provides an additional parameter for the socket_id:

	pusher.triggerPush("test_channel", "my_event", jsonData, socketId);

The PusherRequest class can also be used to encapsulate the event contents:

	PusherRequest request = new PusherRequest("test_channe", "my_event", jsonData);
	pusher.triggerPush(request);
	
That's it.
	
License
-------
Copyright 2010, Stephan Scheuermann. Licensed under the MIT license: http://www.opensource.org/licenses/mit-license.php