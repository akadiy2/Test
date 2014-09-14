
public class OrderedPair<K, V> implements Pair {
	
	protected K key;
	
	protected V value;
	
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderedPair [key=" + key + ", value=" + value + "]";
	}

	@Override
	public V getValue() { 
		// TODO Auto-generated method stub
		return this.value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof OrderedPair)) {
			return false;
		}
		OrderedPair other = (OrderedPair) obj;
		if (key == null) {
			if (other.key != null) {
				return false;
			}
		} else if (!key.equals(other.key)) {
			return false;
		}
		if (value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!value.equals(other.value)) {
			return false;
		}
		return true;
	}
	
	
}
