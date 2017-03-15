RoundCornerLayout
==========
A frame layout with rounded corners for Android.

Snapshot
----------
<img width="225" height="400" src="/static/snapshot.png"/>

Download
----------
Gradle:

```gradle
repositories {
  jcenter()
}

dependencies {
  compile 'com.skyline.widget:round-corner-layout:1.0.1'
}
```

Maven:

```xml
<dependency>
  <groupId>com.skyline.widget</groupId>
  <artifactId>round-corner-layout</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```

Usage
----------
1. Default style

```xml
<com.skyline.widget.layout.RoundCornerLayout
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <!-- Add your target layout here -->
</com.skyline.widget.layout.RoundCornerLayout>
```

2. Custom style

```xml
<com.skyline.widget.layout.RoundCornerLayout
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:cornerRadius="10dip"
    app:topLeftEnabled="true"
    app:topRightEnabled="true"
    app:bottomLeftEnabled="false"
    app:bottomRightEnabled="false">

    <!-- Add your target layout here -->
</com.skyline.widget.layout.RoundCornerLayout>
```

Sample
----------
Click [here](https://raw.githubusercontent.com/skyline1631/RoundCornerLayout/master/static/rcl-sample.apk) to download the sample apk.

License
----------

    Copyright (C) 2017 Legolas Kwok.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
