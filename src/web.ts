import { WebPlugin } from '@capacitor/core';

import type { CapdndPlugin } from './definitions';

export class CapdndWeb extends WebPlugin implements CapdndPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
