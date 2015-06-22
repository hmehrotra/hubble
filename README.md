# hubble

<b>Directory Structure</b>
Hubble follows a standary directory structure for Angular projects higer level division is by functionality and lower level dicision is by component types. Here is the relevant directory structure <br><br>
.<br>
├── segmentList<br>
│   ├── SegmentListView.html<br>
│   └── SegmentListCtrl.js<br>
├── login<br>
│   └── LoginController.js<br>
├── libs<br>
│   └── angular-ui-router.js<br>
├── jquery<br>
│   ├── jquery.ui.widget.js<br>
│   ├── jquery.ui.tabs.js<br>
│   ├── jquery.ui.position.js<br>
│   ├── jquery.ui.menubar.js<br>
│   ├── jquery.ui.menu.js<br>
│   ├── jquery.ui.core.js<br>
│   ├── jquery.ui.button.js<br>
│   ├── jquery.layout-latest.js<br>
│   ├── jquery-ui-1.10.4.custom.js<br>
│   ├── jquery-1.10.2.js<br>
│   └── jMenu.jquery.js<br>
├── countryList<br>
│   ├── CountryListView.html<br>
│   └── CountryListCtrl.js<br>
├── controllers.js<br>
├── companyList<br>
│   ├── CompanyListView.html<br>
│   └── CompanyListCtrl.js<br>
└── app.js<br>

<br>

<u><b>Hubble Build System</b></u><br>
Build System: https://www.playframework.com/documentation/3.0.x/Build<br>

<u><b>Hubble Dependency Management</b></u><br>
Dependency Management: https://www.playframework.com/documentation/2.0.4/SBTDependencies<br><br>
If you update build.sbt to add any new library dependency, then you would need to regenerate the IDE files so that libraries are downloaded from the repository and added to Classpath. This is done by executing on Play console: <i>idea</i> [For Intellj] or <i>eclipsify</i> [For eclipse ]

<u><b>Debugging</b></u><br>
JPDA Transport mechanism http://docs.oracle.com/javase/7/docs/technotes/guides/jpda/conninv.html<br><br>
The communication between VM being debugged and the debugger is connection oriented, i.e. the VM will act as a server and the debugger as a client (reverse is also possible). The VM needs to create a new socket, bind it to a port and listen for incoming connections from debugger. To do this, execute the following on the play console to create a JPDA port on which the debugger will attach. <br>
<code>activator -jvm-debug 9999</code>
<br><br>
The following shows up on command line<br>
<i>[HubbleClient]</i><br>

Type <i>run</i> to run the app

