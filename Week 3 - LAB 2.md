



#### Why write "+toString() : String" if it's public in both "Stockowner" and "Share" ?
Because **each class is expected to provide its own implementation** of the `toString()` method.

Example:

- `Stockowner.toString()` might return something like:  
    `"Stockowner: Alice, Money: 1000.0, Shares: [list of shares]"`
    
- `Share.toString()` might return something like:  
    `"Share: 10 shares of CorpX owned by Alice"`
    

So each class needs its own version of `toString()` that describes **its own internal state**.

#### Why are there crosses on the association?
**Crosses (X)**
- These are **decorations used by some tools** to reinforce the idea that the association is **owned exclusively** by the `StockMarket`.

#### Why is there a "-" on "-market * " on the association line?
It has **private visibility** (`-`), meaning:
- Only the `StockMarket` class itself can directly access this collection of shares.
- It is **not accessible** from outside the class (e.g., other objects can’t directly access `stockMarket.market`).
#### What does  " `<<Property>>`  -value : float  "mean?

In UML,  `<<...>>`  is called a **stereotype**.

- A `Property` is a general term for a **typed attribute** owned by a class.
- So `<<Property>>` just reinforces that this is a **normal class attribute** (i.e., "value" is a property of `Corporation`).