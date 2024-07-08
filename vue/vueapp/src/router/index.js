// router/index.js
import { createRouter, createWebHistory } from 'vue-router';

import Notice from '../views/Notice.vue'; // 导入公告组件

const routes = [
    {
        path: '/#/notice/notice',
        name: 'Notice',
        component: Notice // 配置公告路由
    },
    // 其他路由配置
];

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
});

export default router;
