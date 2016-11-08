package org.example.oleg.menu;

import java.util.ArrayList;
import java.util.List;

import org.example.oleg.event.IEvent;
/*
 * меню
 */
public class MenuFactory {
	private static final String Q_QUIT = "; q - выход";
	private static final String NULL_BREAK = "0 - break";
	private static final String SPLIT = "; ";
	private static final String HYPHEN = " - ";
	private static final int ONE = 1;
	private String title;
	private MenuFactory rootMenu;
	//private MenuFactory[] subMenus;
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
	
	public MenuFactory(String title, MenuFactory rootMenu) {
		this.title = title;
		this.rootMenu = rootMenu;
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
				builder.append(i + ONE).append(HYPHEN).append(this.subMenyList.get(i).getTitle()).append(SPLIT);
			}
			if(this.rootMenu!=null){
				builder.append(NULL_BREAK);
			}
			
			
		}
		else {
			builder.append(NULL_BREAK);
		}
		builder.append(Q_QUIT);
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
