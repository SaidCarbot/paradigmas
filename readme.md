3. **Post-Quantum Measurement and Classical Postprocessing**:
   - **Step 4**: Once the quantum part determines the order \( r \), if \( r \) is even and \( a^{r/2} \neq -1 \mod N \), then the gcd of \( a^{r/2} - 1 \) and \( N \) is computed. This step can yield a non-trivial factor of \( N \).
   - **Step 5**: If the factors are not found directly, a new value of \( a \) is chosen, and the order-finding quantum procedure is repeated
