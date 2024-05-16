import { registerPlugin } from '@capacitor/core';
import type { CapdndPlugin } from './definitions';

const Capdnd = registerPlugin<CapdndPlugin>('Capdnd', {
  web: () => import('./web').then(m => new m.CapdndWeb()),
});

export * from './definitions';
export { Capdnd };
