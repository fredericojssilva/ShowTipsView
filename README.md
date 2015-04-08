ShowTipsView
============

ShowTipsView let you highligth specific points of interest of your app.

<a href="" target="_blank"><img src="https://github.com/fredericojssilva/ShowTipsView/blob/master/sample.png"/></a>

Usage
====
    ShowTipsView showtips = new ShowTipsBuilder(this)
		.setTarget(btn_test)
		.setTitle("A magnific button")
		.setDescription("This button do nothing so good")
		.setDelay(1000)
		.build();
		
	showtips.show(this);
	
Customization
=======
    //COLORS
    setTitleColor(int color)
    setDescriptionColor(int color)
    setBackgroundColor(int color)
    setCircleColor(int color)

By default the circle will adjust to the passed view, if you want a custom radius and position use: 

    setTarget(View v, int x, int y, int radius)
    
There is a listener for the "Got it" button. You can use it for example to create consecutive tips, just set the callback and create a new ShowTip, like this:

    showtips.setCallback(new ShowTipsInterface(){
	    @Override
	    public void gotItClicked() {
	    //Lunch new showtip
	    }
    });
    
To only display the tip one time just call displayOneTime(int showtipId) on the Builder. 

<u>showtipId</u> is a unique id for that tip.

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ShowTipsView-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1132)

##Download
**Gradle:**
```
compile 'net.fredericosilva:showTipsView:1.0.1'
```
## License
Copyright (c) 2014 Frederico Silva

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

	


