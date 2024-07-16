# What is LRU?
The Least Recently Used (LRU) algorithm is a cache replacement policy that discards the least recently used items first. In the context of computer memory, it is used to manage the contents of a cache to ensure that the most frequently or recently accessed data remains in fast storage, while less frequently used data is moved to slower storage or discarded.

LRU works on the principle that items that have been accessed recently are more likely to be accessed again soon. Therefore, when the cache reaches its capacity, LRU removes the item that has not been used for the longest period.
# Disadvantage
LRU may eliminate the most frequently used page when it reaches its capacity.

# What is LFU?
The Least Frequently Used (LFU) algorithm is a cache replacement policy that removes the least frequently accessed items first. It is designed to keep the most frequently accessed items in the cache while evicting items that are accessed less often.

The basic idea behind LFU is that items that are accessed frequently are more likely to be accessed again in the future, so they should be kept in the cache. Conversely, items that are accessed infrequently are less likely to be needed again soon and can be safely removed when the cache needs to make room for new items.
# Disadvantage
LFU may eleiminate the most recently used page when it reaches its capacity

# 2Queue
It is baisically to overcome the disadvantages of LRU and LFU by using two queue's which are going to act as a LRU queue's one is going to have the pages which are accessed only one times named Aonce and when the pages accessed multiple times it's going to stored in another queue called Amany(note: both are going to act as a LRU) by this we can have a Most Frequently used page as well as Most Recently used page.
Pages can be represented as key value pairs with get() and put() method.
