package org.example.oleg.menu;

import java.util.ArrayList;
import java.util.List;

import org.example.oleg.event.IEvent;

public class MenuFactory {
	private String title;
	private MenuFactory rootMenu;
	private MenuFactory[] subMenus;
	private List<MenuFactory> subMenyList=new ArrayList<MenuFactory>();
	private IEvent event;
	private String help;

	public MenuFactory() {
	}
	
	public MenuFactory(String title, IEvent event) {
		this.title=title;
		this.event=event;
	}
	
	public MenuFactory(String title) {
		this.title=title;

	}
	public MenuFactory(String title, MenuFactory rootMenu, List<MenuFactory> subMenyList, IEvent event) {
		this.setSubMenyList(new ArrayList<MenuFactory>(subMenyList));
		this.title = title;
		this.rootMenu = rootMenu;
		this.event = event;
	}

	public MenuFactory(String title, MenuFactory rootMenu, IEvent event) {
		this.title = title;
		this.rootMenu = rootMenu;
		this.event = event;
	}

	public MenuFactory(String title, List<MenuFactory> subMenyList, IEvent event) {
		this.setSubMenyList(new ArrayList<MenuFactory>(subMenyList));
		this.title = title;
		this.event = event;
	}

	/**
	 * @param event
	 *            the title to get
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param event
	 *            the title to get
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the rootMenu
	 */
	public MenuFactory getRootMenu() {
		return rootMenu;
	}

	/**
	 * @param rootMenu
	 *            the rootMenu to set
	 */
	public void setRootMenu(MenuFactory rootMenu) {
		this.rootMenu = rootMenu;
	}

	/**
	 * @return the subMenus
	 */
	public MenuFactory[] getSubMenus() {
		return subMenus;
	}

	/**
	 * @param subMenus
	 *            the subMenus to set
	 */
	public void setSubMenus(MenuFactory[] subMenus) {
		this.subMenus = new MenuFactory[subMenus.length];
		this.subMenus = subMenus;
		this.setHelp();

	}

	/**
	 * @return the event
	 */
	public IEvent getEvent() {
		return event;
	}

	/**
	 * @param event
	 *            the event to set
	 */
	public void setEvent(IEvent event) {
		this.event = event;
	}

	/**
	 * @return the help
	 */
	public String getHelp() {
		return help;
	}

	/**
	 * @param help
	 *            the help to set
	 */
	public void setHelp() {
		StringBuilder builder = new StringBuilder();
		if (this.subMenyList.size() > 0) {

			for (int i = 0; i < this.subMenyList.size(); i++) {
				builder.append(i + 1).append(" - ").append(this.subMenyList.get(i).getTitle()).append("; ");
			}
			if(this.rootMenu!=null){
				builder.append("0 - break");
			}
			
			
		}
		else {
			builder.append("0 - break");
		}
		this.help = builder.toString();

	}

	/**
	 * @return the subMenyList
	 */
	public List<MenuFactory> getSubMenyList() {
		return subMenyList;
	}

	/**
	 * @param subMenyList
	 *            the subMenyList to set
	 */
	public void setSubMenyList(List<MenuFactory> subMenyList) {
		this.subMenyList = subMenyList;
	}

}
