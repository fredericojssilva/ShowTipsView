ShowTipsView
============

ShowTipsView let you highligth specific points of interest of your app.

<a href="" target="_blank"><img src="https://github.com/amlcurran/ShowcaseView/raw/master/sample.png"/></a>

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


	


