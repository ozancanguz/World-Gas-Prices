# World-Gas-Prices

-I have developed a android mobile app that contains world gas prices and informations.
There are different screens for usa,europe,turkey. Data changes everyday by api.

# DEMO

![worldgasprices](https://user-images.githubusercontent.com/64928807/214646334-918b0c69-0e53-461b-883e-6997fa83c5a6.gif)


# Architecture


This app implements MVVM architecture. App consist of different fragments and 1 root activity. Activity holds a container layout in order to manage fragments which will be controlled by navigation component. Here is the package structure:

![image](https://user-images.githubusercontent.com/64928807/219080594-d41f9c5c-6621-44dd-be6a-7fb2424b9150.png)

Data

Data package should include response models, data source. It shouldn't know any logic.

UI

UI like a feature. It contains Fragments,  and feature related classes like a domains, mappers and ui models. Make sure that all classes here are specific to the this feature. If it is a class that is also used in other features, it should be moved to the common package.

Di

This package may actually be inside the common module. But I prefer to carry outside of core package to be more visible.

Viewmodel

This package includes viewmodels.


**Tools that I used** :

- Navigation Component
- Hilt for dependency injection
- Retrofit 
- Postman for Api testing.
- Coroutines for database
- Livedata.
- View Binding
- RESTApi
- LottieAnimationView



