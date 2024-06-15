# 📟 NUMERICAL DATA ANALYZER 📟

**Numerical Data Analyzer** is an application designed to perform various statistical and sequence analyses on a file containing numerical data. The app provides a user-friendly interface built with the Swing library, allowing users to easily load their data files and view the results.

## Features

The application can compute and display the following metrics and sequences from the provided data:

- __Maximum Value:__ Finds the highest number in the file.
- __Minimum Value:__ Finds the lowest number in the file.
- __Median:__ Calculates the median of the numbers in the file.
- __Arithmetic Mean:__ Computes the average value of the numbers.
- __Longest Increasing Sequence:__ Identifies the longest subsequence of consecutive numbers that are in increasing order. UI provided by Swing package displays the number of the longest increasing sequence. The values of that sequence are printed in console
- __Longest Decreasing Sequence:__ Identifies the longest subsequence of consecutive numbers that are in decreasing order. UI provided by Swing package displays the number of the longest decreasing sequence. The values of that sequence are printed in console

## Usage

1. **Load Data:** Once the app is started there will be a window to select the file containing the numerical data.
 
![Choose a file](https://drive.google.com/uc?export=view&id=1UFNuZ5lkbUiEmK2zU-bS2lbti6KDVfX1)

2. **View Results:** The app will process the data and display the results, including the maximum, minimum, median, mean values, and the number of the longest increasing and decreasing sequences.

![Result swing window](https://drive.google.com/uc?export=view&id=16-gKDAJ4h6g_h0CvGo7_nwJ6etW3wQ3c)

3. **View Results In Console:** The app will also display the results to console, including the maximum, minimum, median, mean values, and the number of the longest increasing and decreasing sequences and sequences themselves, time needed to process data (without time needed to read the file), and number of elements in the file.

![Result in console](https://drive.google.com/uc?export=view&id=11qHswoEukXEx5582UxKY8tocvadUE79j)

## Important notice
For proper app operation the file should include one numerical value per line without white spaces or any other texts.
Example:

![file content example](https://drive.google.com/uc?export=view&id=1AtqUpHG7JaraN3rsOeCNHDmQR12r_Juq)