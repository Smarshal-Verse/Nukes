# Nuclear Detonation Detector App
## Overview

The Nuclear Detonation Detector App is an advanced mobile application designed to detect potential nuclear detonations using a machine learning model. The app utilizes satellite imagery and Twitter news data to train the model, and it strategically deploys the model at railway locations for improved detection near critical infrastructure. The app integrates controllers, AlarmManager, and Ktor for efficient handling of alerts and real-time communication.

<img src="https://github.com/Smarshal-Verse/Nukes/assets/99678760/6a65e3de-a7e4-49e7-9a52-02ad120843fb" width="700" height="350" /> 


## Features

1. **Machine Learning Detection**: Utilizes a sophisticated machine learning model trained on satellite imagery and Twitter news data to accurately identify potential nuclear detonations.

2. **Railway Deployment**: The model is strategically deployed at railway locations, leveraging their proximity to critical infrastructure for enhanced detection capabilities.

3. **Real-time Alerts**: Sends immediate alerts to a central server upon detecting a nuclear detonation, ensuring swift notification.

4. **Override Do Not Disturb Mode**: Overrides the device's "Do Not Disturb" mode using the AlarmManager, delivering critical alerts even in silent or restricted modes.

5. **User-friendly Interface**: Features an intuitive and user-friendly interface for easy understanding and response to alerts.

6. **Location-based Tracking**: Utilizes location services to provide users with information on the proximity of the detected detonation.

## How It Works

1. **Training the Model**: The machine learning model is trained using a combination of satellite imagery and Twitter news data to identify patterns associated with nuclear detonations.

2. **Railway Deployment**: The trained model is deployed at railway locations, taking advantage of their strategic positioning for enhanced detection capabilities.

3. **Real-time Detection**: The model continuously analyzes incoming data for signs of a nuclear detonation. Upon detection, the app sends an alert to the central server.

4. **Alert Notification**: The central server processes the alert and notifies the app, which then uses the AlarmManager to override the device's "Do Not Disturb" mode, delivering a high-priority alert to the user.

## Disclaimer

The Nuclear Detonation Detector App is designed for informational purposes only. While the machine learning model has been trained on diverse datasets, false positives may occur. Users are encouraged to follow official safety protocols and contact local authorities in the event of an alert.
