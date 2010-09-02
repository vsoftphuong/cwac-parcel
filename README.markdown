CWAC ParcelHelper: Runtime Assistance for Parcel Developers
===========================================================
If you are creating reusable libraries using the techniques
described in [the Android Parcel Project](http://andparcel.com),
then this library may be useful to you.

It supplies you with a `ParcelHelper` class, designed to help you
deal with the naming conventions required of resources packaged
in a reusable library.

This is packaged as an Android library project, though a simple
JAR is also available from the Downloads section of this
GitHub repository.

Usage
-----
Your library's code creates a `ParcelHelper` instance, supplying it
with your library's name (e.g., my-parcel) and a `Context` suitable
for looking up resource IDs. Then, when you need a resource ID,
you call one of the `ParcelHelper` getter methods:

* `getLayoutId()` for layouts (replacing `R.layout`)
* `getItemId()` for item IDs (replacing `R.id`)
* `getMenuId()` for menus (replacing `R.menu`)
* `getDrawableId()` for drawables (replacing `R.drawable`)
* `getStyleableId()` for so-called "styleables" (replacing `R.styleable`)
* `getStyleableArray()` for getting the `int[]` array of "styleables"
* `getIdentifier()` for anything else

Each of those takes the original name of the resource (e.g., `"main"`)
as a parameter. `getIdentifier()` takes the type of the resource as
the second parameter (e.g., `"string"` for a string resource).

The advantage of using `ParcelHelper` is two-fold:

1. It caches the lookups, since they are relatively expensive.
2. It automatically mangles in your parcel name wherever it is
needed.

Dependencies
------------
None at present.

Version
-------
This is version v0.2.0 of this library.

Demo
----
There is no demo project. Please refer to the [`cwac-colormixer` library](http://github.com/commonsguy/cwac-colormixer)
for an example of `ParcelHelper` in use. This is also covered in
the Android Parcel Project's [developer documentation](http://andparcel.com/docs).

License
-------
The code in this project is licensed under the Apache
Software License 2.0, per the terms of the included LICENSE
file.

Questions
---------
If you have questions regarding the use of this code, please
join and ask them on the [cw-android Google Group][gg]. Be sure to
indicate which CWAC module you have questions about.

Release Notes
-------------
v0.2.0: converted to Android library project

Who Made This?
--------------
<a href="http://commonsware.com">![CommonsWare](http://commonsware.com/images/logo.png)</a>

[gg]: http://groups.google.com/group/cw-android
