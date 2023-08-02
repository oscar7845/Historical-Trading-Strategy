# Historical Trading Strategy 
This desktop application conducts simulations to backtest and optimize trading strategies using historical data. The simulator specifically focuses on the Ichimoku and Fibonacci strategies and optimizes trading strategies by testing thousands of parameters and returning the most efficient result. Built to optimize trading strategies for a specific market based on the historical data contained in the file you are passing in, specifically for long periods.

## The Idea
It can be helpful to see how strategies would have performed in the past and determine if one would have made a profit using a certain trading strategy. By applying the Ichimoku and Fibonacci strategies on years of historical data (BTC in my current simulation), it lets you see the efficacy of the methods basically acting as a learning tool and also a way to optimize your strategy. The goal was to be able to provide some sort of insights in order to make better trading decisions, as the crypto market can seem unpredictable but historical data is still useful.

## How it works
Historical data is stored in the .txt file and is processed and stored in a 2D array format. 
Ichimoku Strategy: this is the primary strategy used and the method evaluates trading decisions using the Ichimoku cloud technique.
Fibonacci Strategy: it assesses trading decisions based on Fibonacci retracement levels derived from price data.
The Utility class contains the utility functions which are needed for financial calculations. Some used are moving averages, Fibonacci retracement, andd MACD histogram calculations.
Finally, the Simulator class employs multithreading, running multiple scenarios simultaneously, and optimizing based on the parameters provided. In this class, during the passing of testing parameters into the simulator, we are incrementing 'ratio' by 0.0001, 1000 times and running a simulation on each to see how it impacts the trading strategy. This means the simulator will run 1000 times and return the best 'ratio'for this particular strategy

## How it was built
The simulator's logic is implemented using Java. Ichimoku, Fibonacci, and Utils classes define and evaluate trading strategies. The Simulator class is basically the center of the app and controls all around it by managing how to use data, run simulations, and provide the results. There are also XML files for ensuring correct character encoding, set up configurations and module inclusions, and define the module structure.

## Bugs and challenges

## Things learned

## Roadmap
