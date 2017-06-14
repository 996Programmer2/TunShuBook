package com.tunshu.tunshubook.fragment;

import java.util.HashMap;

/**
 * 获取Fragment的工厂，根据传递的序号获取
 * 
 * @author Whipan
 * 
 */
public class FragmentFactory {
	private static HashMap<Integer, BaseFragment> fragmentMap = new HashMap<Integer, BaseFragment>();

	public static BaseFragment createFragment(int pos) {
		BaseFragment fragment = fragmentMap.get(pos);
		if (fragment == null) {
			switch (pos) {
			case 0:
				fragment = new HomeFragment();
				break;
			case 1:
				fragment = new CommunityFragment();
				break;
			case 2:
				fragment = new MessageFragment();
				break;
			case 3:
				fragment = new MeFragment();
				break;
			default:
				break;
			}

			fragmentMap.put(pos, fragment);
		}

		return fragment;
	}
}
