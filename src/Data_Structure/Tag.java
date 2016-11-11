package Data_Structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tag {
	boolean has_synonyms;
	boolean is_moderator_only;
	boolean is_required;
	long count;
	String name;
	/**
	 * @param has_synonyms
	 * @param is_moderator_only
	 * @param is_required
	 * @param count
	 * @param name
	 */
	public Tag(boolean has_synonyms, boolean is_moderator_only, boolean is_required, long count, String name) {
		super();
		this.has_synonyms = has_synonyms;
		this.is_moderator_only = is_moderator_only;
		this.is_required = is_required;
		this.count = count;
		this.name = name;
	}
	/**
	 * @return the has_synonyms
	 */
	public boolean isHas_synonyms() {
		return has_synonyms;
	}
	/**
	 * @return the is_moderator_only
	 */
	public boolean isIs_moderator_only() {
		return is_moderator_only;
	}
	/**
	 * @return the is_required
	 */
	public boolean isIs_required() {
		return is_required;
	}
	/**
	 * @return the count
	 */
	public long getCount() {
		return count;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param has_synonyms the has_synonyms to set
	 */
	public void setHas_synonyms(boolean has_synonyms) {
		this.has_synonyms = has_synonyms;
	}
	/**
	 * @param is_moderator_only the is_moderator_only to set
	 */
	public void setIs_moderator_only(boolean is_moderator_only) {
		this.is_moderator_only = is_moderator_only;
	}
	/**
	 * @param is_required the is_required to set
	 */
	public void setIs_required(boolean is_required) {
		this.is_required = is_required;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(long count) {
		this.count = count;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tag [has_synonyms=" + has_synonyms + ", is_moderator_only=" + is_moderator_only + ", is_required="
				+ is_required + ", count=" + count + ", name=" + name + "]" + "\n";
	}
	
	public static Tag MaptoC_Tag(HashMap<String,Object> tag) {
		return new Tag(tag.containsKey("has_synonyms")?(boolean)tag.get("has_synonyms"):false, 
				tag.containsKey("is_moderator_only")?(boolean)tag.get("is_moderator_only"):false, 
				tag.containsKey("is_required")?(boolean)tag.get("is_required"):false, 
				tag.containsKey("count")?Long.valueOf((Integer)tag.get("count")):-1, 
				tag.containsKey("name")?(String)tag.get("name"):"UNKNOWN");
	}
	
	public static ArrayList<Tag> JSON_ListtoTag_List(ArrayList<HashMap<String, Object>> json_list) {
		ArrayList<Tag> tag_list = new ArrayList<Tag>();
		for(HashMap<String, Object> tag : json_list) {
			tag_list.add(MaptoC_Tag(tag));
		}
		return tag_list;
	}
}
