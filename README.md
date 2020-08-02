This type code does not run if executed from an IDE.<br/>
<br/>
Following steps are required to run this example:<br/>
1.Paste the code into some directory<br/>
2.Open the ubuntu terminal and move to that directory.<br/>
3.Type the following commands:<br/>
	a. $javac *.java (For compiling the program)<br/>
	b. $rmic Bank (Generates skeletons and stubs)<br/>
	c. $rmiregistry &<br/>
	d. $java Initializer (For running the Target program)<br/>
4. Now, open the second terminal.<br/>
5. Type the following commands in the second terminal:<br/>
	a. $javac Source.java (For compiling the Source class)<br/>
	b. $java Source (For running the Source program)<br/>
6. It will be observed that the client-side code will send request for the target service, the output of which will be displayed to server side as well.<br/>
