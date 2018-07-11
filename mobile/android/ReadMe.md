Android OS software components is divided in to 5 section and four main layers
==============================================================================
1) Appplications
       - Home, Dialer, SMS/MMS, IM, Contacts, Browser, Camera, Alarm, Calculator, etc

2) Application Frameworks
       - Activity Manager = controls application lifecycle activity
       - Content Providers
       - Resource Manager
       - Notification Manager
       - Window Manager etc...

3) Libraries
       - Surface Manager, Media Framework, SQLite etc...

   Android Runtime
       - Core Libraries, Dalvk VM

4) Linux Kernel
       - Linux Kernel, Power Management and other drivers


AndroidManifest.xml
===================
- Should present at the project root folder
- Provides essential informaiton to Android build toos, Android OS and Google Play

  In manifest file
  ================
  - Build tools replaces apps package name with app id which is a unique app identifier on system and google play.
  - Defines app components
  - Permissions
  - The hardware and software features (which devices can install)

  Four Main components
  - Activities
  - Services
  - Broadcast Receivers
  - Content Providers

java
====
- contains java soures including unit tests

res
===
- contains all non-code resources
- subdirectories can be <resource_name>-<config_qualifier>
  resource_name is like "drawable" and config qualifier is like "hdpi" = drawable-hdpi means resources for hid resoulation screens
  check android default config_qualifiers for detailed info.

Activities = Represents single screen in an UI
Services = Long running backgroud applications
Broadcast Receivers = Respond to messages from other applications or from the system.
Content Provider = Supplies data to others on request.


When your application is compiled, a "R" class gets generated, which contains resource IDs for all the available resources in "res/" directory.
R class is used as "R.<id>.<name>" in the java code.

Activity Class
==============
Sequence of invocation

Activity Launched
  onCreate()
  onStart()
  onResume()
Activity Running
  onPause() -->  onResume()  (apps with high priority / memory need ---> App process killed --> onCreate() )
  onStop()  --> onRestart() --> onStart()  when the activity is no longer visible 
  onDestory()  Activity finished / destoryed by system
Activity Shutdown 

Service
=======
Component runs in the background no interaction needed with UI. It can run even if app is destroyed.
Service is created with "startService()"  or  "bindService()"

startService() -> onCreate() -> onStart() -> Service is running -> Stopped -> onDestroy() -> Service is shutdown
bindService()  -> onCreate() -> onBind()  -> Client interaction -> onUnbound() -> onDestroy() -> Service is shutdown


