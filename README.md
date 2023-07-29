# Historical-Trading-Strategy
Strategy Test Algorithm with Historical Data

## The Idea

## How it works
In the Simulator class, during the passing of testing parameters into the simulator, we are incrementing 'ratio' by 0.0001, 1000 times and running a simulation on each to see how it impacts the trading strategy. This means the simulator will run 1000 times and return the best 'ratio'for this particular strategy
```sh
        for (i = 0; i < iterations; i++) {
            threads.add(new simulate(ratio + 0.0001*i));
        }
```
This loop can be customized as wanted. We can set up a double or even triple loop to run simulations on multiple parameters at the same time, optimizing for each simultaneously.


## How it was built

## Bugs and challenges

## Things learned

## Roadmap
