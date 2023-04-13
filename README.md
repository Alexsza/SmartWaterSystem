# SmartWaterSystem
Project for Distributed Systems, 3 Smart Water System services, each using few different types of rpc

Introduction
The proposed smart water application can be integrated into the overall Building Management System (BMS) of a commercial environment to effectively monitor and help reduce water usage, conserve water, save on water and electricity bills, and promote sustainability in a commercial retail setting. The proposed application is designed for a forecourt retail setting that has car wash services, restaurants and public restrooms, all areas where smart water monitoring can make a huge impact to both the bottom line of the business and the environment. The installation of smart meters and sensors are essential for an automated and continuous data flow, that must be analysed and transformed into a plan to optimise water and water-related energy use. The water monitoring service is an essential tool for the application, as usage data provided by the sensors and the smart meters have to be available for the other services to function properly as well. Each service has specific methods that allow for communication between the client and the server. 
Overall, the Smart Water Management Application aims to provide comprehensive water management services to retail commercial settings, allowing for real-time monitoring, optimization, and conservation of water usage to reduce costs and promote sustainability.

Service 1: WaterMonitoringService
This service deals with monitoring real-time water usage and identifying potential areas where water is being wasted and helps detect water leaks. The service uses sensors to collect data and smart water meters to provide automated readings with comprehensive information that is sent to a central monitoring server via gRPC. The server then analyses this data and sends alerts if an issue has been identified, and any other information to help facility management to reduce water usage and save on water bills.	Methods
1.1	RPC MonitorArea
The server streaming RPC is used to continuously monitor a specific area of the commercial setting for potential water waste or leaks. The client sends a request for monitoring, including the name of the area, to the server, which then streams updates with the current water usage and any potential issues. An example use of this method would be the water usage monitoring of the toilet facilities, such as toilets/urinals continuously flushing or the auto taps not shutting off.
rpc MonitorArea(MonitorAreaRequest) returns (stream MonitorAreaResponse)
Request: areaName; Response: waterUsage;  issues 
1.2	RPC SendSensorData
A bidirectional RPC method is used for real-time monitoring and analysis of water usage and potential issues in different areas of the retail commercial setting. The client and server both send and receive streams of data, including current water usage and any potential issues, and the server responds with alerts and recommendations for reducing water usage and saving on water bills. This method gives an overview for the client of the overall water usage of the site.
rpc SendSensorData(stream SendSensorDataRequest) returns (stream SendSensorDataResponse)
Request: areaName, waterUsage, waterLeak; Response: alert, recommendation

Service 2: HotWaterManagement
This service monitors and controls the hot water usage within the retail site, including the hot water tanks and pumps. The service uses the sensors to collect data on the tank levels, water temperature, water pressure and flow and send it to the server via gRPC. The server analyze the data to optimise the hot water usage, control the tanks to maintain a consistent hot water temperature and level and control the pumps to maintain a consistent hot water pressure and flow rate. Schedules can be set based on occupancy and usage patterns to provide hot water only when it is needed to reduce energy costs associated with heating the water.
Methods
2.1	RPC SetTankTemperature 
This unary RPC method is used to set the temperature of the hot water tank. The client sends a request to the server containing the desired temperature, and the server would respond with a confirmation that the temperature has been set.
rpc SetTankTemperature(SetTankTemperatureRequest) returns (SetTankTemperatureResponse)
Request: desiredTemp Response: confirmation
2.2	RPC SendUsageData
This client streaming RPC method is used to send usage data to the server, which in turns analyses this information to optimize hot water usage. The client continuously sends hot water temperature, tank level, flow rate and water pressure data to the server in real-time, and the server responds with recommendations for how to optimize hot water usage based on the data.
rpc SendUsageData(stream SendUsageDataRequest) returns (SendUsageDataResponse)
Request: hotWaterTemp, tankLevel, flowrate, waterPressure Response: recommendation

Service 3: WaterRecyclingService
This service deals with monitoring the rainwater tank levels and have methods in place to switch between using rainwater and the main supply in specified areas. Water recycling can be installed in the carwash and other non-potable areas, such as toilets, sinks and irrigation. The methods could be invoked by a client, such as the building management system, to automate the process of using rainwater for non-potable purposes to significantly reduce the amount of fresh water required and conserve the use of the main supply.
Methods
3.1	RPC CheckTankLevel
This unary RPC method accepts a request to check the current level of a rainwater tank specified by a tank id. The method then returns a response containing the current level of the tank.
rpc CheckTankLevel(TankRequest) returns (TankResponse)
Request: tankId; Response: tankLevel
3.2	RPC MonitorTankLevels
This server streaming RPC allows the server to send multiple responses to the client over time as the tank levels change, therefore it is a good fit for the task, as it is an ongoing process that requires regular updates. With this method, the client sends a single request for monitoring the tank levels and the server sends a stream of responses back to the client containing the current level of each tank.
 rpc MonitorTankLevels(MonitorTankLevelsRequest) returns (stream MonitorTankLevelsResponse)
	Request: tankID;  Response: tankId, currentLevel;
3.3	RPC  SwitchToRainwaterTank
This client streaming RPC method accepts a stream of requests to switch the water supply in a specified area, such as toilets or car wash, to use rainwater from multiple tanks specified by tank ids. The method will periodically check the level of each tank and switch the water supply to the rainwater tank with the highest level. The method then sends a response indicating the current level of each tank and which tank was being used for the water supply. 
rpc SwitchToRainwaterTank (stream RainwaterTankRequest) returns (RainwaterTankResponse)
	Request tankId, area; Response: tankLevels, currentTankUsed
