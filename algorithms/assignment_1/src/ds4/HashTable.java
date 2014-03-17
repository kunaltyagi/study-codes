package ds4;

/**
 *
 * @author kunaltyagi
 */
public class HashTable {
    

    /**
 * JS Implementation of MurmurHash3 (r136) (as of May 20, 2011)
 * 
 * @author <a href="mailto:gary.court@gmail.com">Gary Court</a>
 * @see http://github.com/garycourt/murmurhash-js
 * @author <a href="mailto:aappleby@gmail.com">Austin Appleby</a>
 * @see http://sites.google.com/site/murmurhash/
 * 
 * @param {string} key ASCII only
 * @param {number} seed Positive integer only
 * @return {number} 32-bit positive integer hash 
 */
    private String _key;
    private long _seed;
    private int M;
    
    public long murmurhash3_32_gc(String key, long seed) {
	long remainder, bytes, h1, h1b, c1, c1b, c2, c2b, k1;
        int i;

	remainder = key.length() & 3; // key.length % 4
	bytes = key.length() - remainder;
	h1 = seed;
	c1 = 0xcc9e2d51;
	c2 = 0x1b873593;
	i = 0;

	while (i < bytes) {
	  	k1 = (long)
	  	  (( key.charAt(  i) & 0xff)      ) |
	  	  (( key.charAt(++i) & 0xff) << 8 ) |
	  	  (( key.charAt(++i) & 0xff) << 16) |
	  	  (( key.charAt(++i) & 0xff) << 24);
		++i;

		k1 = ((((k1 & 0xffff) * c1) + ((((k1 >>> 16) * c1) & 0xffff) << 16))) & 0xffffffff;
		k1 = (k1 << 15) | (k1 >>> 17);
		k1 = ((((k1 & 0xffff) * c2) + ((((k1 >>> 16) * c2) & 0xffff) << 16))) & 0xffffffff;

		h1 ^= k1;
        h1 = (h1 << 13) | (h1 >>> 19);
		h1b = ((((h1 & 0xffff) * 5) + ((((h1 >>> 16) * 5) & 0xffff) << 16))) & 0xffffffff;
		h1 = (((h1b & 0xffff) + 0x6b64) + ((((h1b >>> 16) + 0xe654) & 0xffff) << 16));
	}

	k1 = 0;

	switch ((int)remainder) {
		case 3: k1 ^= (key.charAt(i + 2) & 0xff) << 16;
		case 2: k1 ^= (key.charAt(i + 1) & 0xff) <<  8;
		case 1: k1 ^= (key.charAt(i    ) & 0xff);

		k1 = (((k1 & 0xffff) * c1) + ((((k1 >>> 16) * c1) & 0xffff) << 16)) & 0xffffffff;
		k1 = (k1 << 15) | (k1 >>> 17);
		k1 = (((k1 & 0xffff) * c2) + ((((k1 >>> 16) * c2) & 0xffff) << 16)) & 0xffffffff;
		h1 ^= k1;
	}

	h1 ^= key.length();

	h1 ^= h1 >>> 16;
	h1 = (((h1 & 0xffff) * 0x85ebca6b) + ((((h1 >>> 16) * 0x85ebca6b) & 0xffff) << 16)) & 0xffffffff;
	h1 ^= h1 >>> 13;
	h1 = ((((h1 & 0xffff) * 0xc2b2ae35) + ((((h1 >>> 16) * 0xc2b2ae35) & 0xffff) << 16))) & 0xffffffff;
	h1 ^= h1 >>> 16;

	return h1;
}
    
    public HashTable()   {
        _key  = "ThhCFXjWLL1ZFj";
        _seed = 2097593;
        M     = 3571;
    }
    
    public HashTable(String key, long seed, int _M)  {
        _key  = key;
        _seed = seed;
        M     = _M;                
    }
    
    public HashTable(Item key, long seed, int _M)    {
        _key  = String.valueOf(key.getId());
        _seed = seed;        
        M     = _M;
    }
    
    public boolean hashify(Item key)    {
        _key = String.valueOf(key.getId());
        return true;
    }
    
    public int arrayIndex(int index)    {
        if(index == 0)  {
            return (int)(murmurhash3_32_gc(_key, _seed) % M);  
        }
        else    {
            return (int)(murmurhash3_32_gc(_key, _seed) % index);
        }
    }
    

}
