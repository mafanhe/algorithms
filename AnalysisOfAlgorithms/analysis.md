#How many array accesses does the following code fragment make as a function of N?
####(Assume the compiler does not optimize away any array accesses in the innermost loop.)
    int sum = 0;
    for (int i = 0; i < N; i++)
      for (int j = i+1; j < N; j++)
        for (int k = 1; k < N; k = k*2)
          if (a[i] + a[j] >= a[k]) sum++;


##answer:3/2N^2lgN
####explanation:Not all triple loops have cubic running times. For a given value of i and j, the k-loop requires only 3lgN array access: the body is executed lgN times and each time involves 3 array accesses.As in the 2-SUM and 3-SUM analysis, the number of times the k-loop is executed is (N2)∼1/2N^2.
